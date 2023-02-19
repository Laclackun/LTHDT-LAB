/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Giai Phuong Trinh Bac 2
 * @author TAMTRAN
 */
public class Cau_2 
{
    public static void main (String[] args)
    {
        float  a, b, c, x1, x2, delta;
        Scanner sc = new Scanner (System.in);
        System.out.print("Xin Hay Nhap a = ");
        a = sc.nextFloat();
        System.out.print("Xin Hay Nhap b = ");
        b = sc.nextFloat();
        System.out.print("Xin Hay Nhap c = ");
        c = sc.nextFloat();
        if (a==0)
        {
            if(b==0)
            {
                if(c==0)
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
            x1 = -c/b;
            System.out.println("Phuong trinh co nghiem x = " + x1);
            }   
        }
        else
        {
            delta = b*b - 4*a*c;
            if (delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem.");
            }
            else if (delta == 0)
            {
                x1 = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep x1 = " + x1);
            }
            else
            {
                x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
                x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
                System.out.println("Nghiem thu nhat x1 = " + x1);
                System.out.println("Nghiem thu nhat x2 = " + x2);
            }
        }
    }    
}

