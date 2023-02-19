/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Giai Phuong Trinh Bac 1
 * @author TAMTRAN
 */
public class Cau_1 
{

       public static void main(String[] args) 
    {
        float a, b, x;
        Scanner sc = new Scanner (System.in);
        System.out.print("Xin Hay Nhap a = ");
        a = sc.nextFloat();
        System.out.print("Xin Hay Nhap b = ");
        b = sc.nextFloat();
        if (a==0)
        {
            if(b==0)
            {
                System.out.println("Phuong trinh vo so nghiem.");
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
        else
        {
            x = -b/a;
            System.out.println("Phuong trinh co nghiem x = "+x);
        }
    }
}
