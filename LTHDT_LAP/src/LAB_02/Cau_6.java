/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Xep Hang Trung Binh
 * @author TAMTRAN
 */
public class Cau_6 
{
    public static void main(String[] args) 
    {
        float DiemTB;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Nhap Diem Trung Binh Cua Ban = ");
        DiemTB = sc.nextFloat();
        
        if (DiemTB < 5.0 && DiemTB >=0 )
        {
            System.out.println("Ban Xep Loai Yeu.");
        }
        else if (DiemTB >= 5.0 && DiemTB < 7.0)
        {
            System.out.println("Ban Xep Loai Trung Binh.");
        }
        else if (DiemTB >= 7.0 && DiemTB < 8.0)
        {
            System.out.println("Ban Xep Loai Kha.");
        }
        else if (DiemTB >= 8.0 && DiemTB <= 10)
        {
            System.out.println("Ban Xep Loai Gioi.");
        }
        else
        {
            System.out.println("Ban Nhap Dung Diem Chua Day ?");
        }
    }
}
