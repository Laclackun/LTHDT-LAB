/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Kiem Tra So Chinh Phuong
 * @author TAMTRAN
 */
public class Cau_5 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.print("Nhap Mot So Nguyen Duong = ");
        n = sc.nextInt();
        }while (n <= 0);
        
        int a = (int)Math.sqrt(n);
        if (a*a == n)
        {
            System.out.println(n + " La So Chinh Phuong.");
        }
        else
        {
            System.out.println(n + " Khong La So Chinh Phuong.");
        }
    }
}
