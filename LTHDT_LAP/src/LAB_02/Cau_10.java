/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to cdonge this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Ma Tran Doi Xung
 * @author TAMTRAN
 */
public class Cau_10 
{
    public static void main(String[] args) 
    {
        int dong, cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        dong = sc.nextInt();
        System.out.println("Nhap so cot: ");
        cot = sc.nextInt();
        int mt [][] = new int [dong][cot];
        System.out.println("Nhap vao so phan tu: ");
        for ( int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                System.out.print("mt[" + i + "," + j + "] = ");
                mt[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma tran sau khi nhap la: ");
        for (int i = 0; i < dong; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                System.out.print( mt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
