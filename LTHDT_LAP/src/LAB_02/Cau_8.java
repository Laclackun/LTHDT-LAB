/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Tinh Giai Thua Cua So Nguyen
 * @author TAMTRAN
 */
public class Cau_8 
{
     public static void main(String[] args) 
     {
        int n;
        Scanner sc = new Scanner (System.in);
        do
        {
            System.out.print("Nhap So Nguyen Duong = ");
            n = sc.nextInt();
        }while (n<0);
        
        long GiaiThua = 1;
        for(int i = 1; i<=n; i++)
        {
            GiaiThua = GiaiThua * i;
        }
        System.out.println(n + "! = " + GiaiThua);
    }
}
