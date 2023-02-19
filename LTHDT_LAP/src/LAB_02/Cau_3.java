/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Tinh Tien Dien
 * @author TAMTRAN
 */
public class Cau_3 
{
    public static void main(String[] args) 
    {
        int SoDien, TienDien;
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin Hay Nhap So Dien Da Dung: ");
        SoDien = sc.nextInt();
        if (SoDien < 50)
        {
            TienDien = SoDien * 1000;
        }
        else
        {
            TienDien = 50*1000 + (SoDien - 50) * 1200;
        }
        System.out.println("Vay Tien Dien Thang Nay La: " + TienDien);
    }
}
