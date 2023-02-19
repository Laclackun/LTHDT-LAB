/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Bang Lua Chon
 * @author TAMTRAN
 */
public class Cau_4 
{
   public static void main(String[] args) 
   {
        int Number;
        do
        {
        Scanner sc = new Scanner (System.in);
        System.out.println("+------------------------+");
        System.out.println("1. Giai Phuong Trinh Bac 1.");
        System.out.println("2. Giai Phuong Trinh Bac 2 ");
        System.out.println("3. Tinh Tien Dien.");
        System.out.println("4. Ket Thuc.");
        System.out.println("+------------------------+");
        System.out.println("Xin Hay Chon Chuc Nang: ");
        Number = sc.nextInt();
        }while (Number < 1 || Number > 4);
        
        switch (Number)
        {
            case 1:
            {
                System.out.println("Giai Phuong Trinh Bac 1.");
                GiaiPTB1(); 
                break;
            }
            case 2:
            {
                System.out.println("Giai Phuong Trinh Bac 2.");
                giaiPTB2();
                break;
            }    
            case 3:
            {
                System.out.println("Tinh Tien Dien.");
                tinhTienDien();
                break;
            }
            case 4:
            {
                System.out.println("Ket Thuc.");
                break;    
            }
    }
    
    public static void GiaiPTB1() 
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
    
    public static void giaiPTB2()
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
    
    public static void tinhTienDien(){
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
