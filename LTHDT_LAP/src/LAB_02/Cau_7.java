/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02;
import java.util.Scanner;

/**
 * Doc Chu So Nguyen Gom 3 Chu So
 * @author TAMTRAN
 */
public class Cau_7 
{
    public static void main(String[] args) {
        int a, b, c, n;
        Scanner sc = new Scanner (System.in);
        do
        {
            System.out.print("Xin Hay Nhap So Nguyen Co 3 Chu So = ");
            n = sc.nextInt();
        }while (n<100 || n>1000);
        a = n % 10;
        b = (n/10) % 10;
        c = n / 100;
        
        switch (c){
            case 1:
                System.out.print("Mot Tram ");
                break;
            case 2:
                System.out.print("Hai Tram ");
                break;
            case 3:
                System.out.print("Ba Tram ");
                break;
            case 4:
                System.out.print("Bon Tram ");
                break;
            case 5:
                System.out.print("Nam Tram ");
                break;
            case 6:
                System.out.print("Sau Tram ");
                break;
            case 7:
                System.out.print("Bay Tram ");
                break;
            case 8:
                System.out.print("Tam Tram ");
                break;
            case 9:
                System.out.print("Chin Tram ");
                break;    
        }
        switch (b){
            case 1:
                System.out.print("Muoi ");
                break;
            case 2:
                System.out.print("Hai Muoi ");
                break;
            case 3:
                System.out.print("Ba Muoi ");
                break;
            case 4:
                System.out.print("Bon Muoi ");
                break;
            case 5:
                System.out.print("Nam Muoi ");
                break;
            case 6:
                System.out.print("sau Muoi ");
                break;
            case 7:
                System.out.print("Bay Muoi ");
                break;
            case 8:
                System.out.print("Tam Muoi ");
                break;
            case 9:
                System.out.print("Chin Muoi ");
                break;    
        }
        switch (a){
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
                break;    
        }
    }
}
