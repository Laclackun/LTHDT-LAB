/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Xoa Phan Tu X Neu Co
 * @author TAMTRAN
 */
public class Cau_9 
{
    public static void main(String[] args) {
        int n, x, vt;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap So Phan Tu: ");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Gia tri cua mang la: ");
        for (int i = 0; i<n; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\nNhap X: ");
        x = sc.nextInt();
        for (int i = vt = 0; i < n; i++){
            if (arr[i] != x){
                arr[vt] = arr[i];
                vt++;
            }
        }
        
        n = vt;
        System.out.print("Mang sau khi xoa X:");
      
        for (int i =0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}
