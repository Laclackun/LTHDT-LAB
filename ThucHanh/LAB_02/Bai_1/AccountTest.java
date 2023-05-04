/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02.Bai_1;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author TNMT
 */
public class AccountTest {
    static Scanner sc = new Scanner(System.in);
    static AccountList accountList;
    
    public static void main(String[] args) {
        accountList = new AccountList();
        showMenu();
    }
    
    private static void showMenu() {
        Account a[] = null;
        int k, b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("--- Menu --- ");
            System.out.print(
                    "1.Them tai khoan\n" +
                    "2.So TK hien co\n" +        
                    "3.In thong tin tat ca TK\n" +
                    "4.Nap tien\n" + 
                    "5.Rut tien\n" + 
                    "6.Chuyen tien\n" + 
                    "7.Ket thuc\n" +
                    "Moi ban nhap lua chon: ");
            b = sc.nextInt();
            switch (b) {
                case 1:
            System.out.print("Nhap so luong khach hang ban muon nhap: ");
                n = sc.nextInt();
                a = new Account[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Khach hang so: " + (i+1));
                    a[i] = new Account();
                    addAccount(a[i]);
                }
                    break;
                case 2:
                    System.out.println("So TK hien co: " + n);
                    break;
                case 3:
                    System.out.printf("________________________________________________________________"
                                      + "\n %-10s %-20s %-20s %-10s \n"  +
                                      "----------------------------------------------------------------\n"
                            , "So TK", "Ten TK", "So Tien Trong TK", "Trang Thai");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 4:
                    System.out.println("Nhap so tai khoan khach hang cần nap tien: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Ban chọn tai khoan: " + d);
                            a[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhap so tai khoan khach hang cần rút tien: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Ban chọn tai khoan: " + d);
                            a[i].rutTien();
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhap so tai khoan khach hang chuyen tien: ");
                    s = sc.nextLong();
                    System.out.print("Nhap so tai khoan khach hang nhan tien: ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            chuyen = a[i].getSotien();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getSotk();
                                if (c == f) {
                                    nhan = a[j].getSotien();
                                    System.out.println("Nhap so tien cần chuyen");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setSotien(chuyen);
                                        a[j].setSotien(nhan);
                                        System.out.println("Tai khoan so " + d + " vừa chuyen: $" + tienChuyen);
                                        System.out.println("Tai khoan so " + f + " vừa nhan: $" + tienChuyen);
                                    } else {
                                        System.out.println("So tien nhap khong hợp le!");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Lựa Chọn Không Hợp Lệ Mới Chọn Lại.");
                    break;
            }
        } while (flag);
    }
    
    static void addAccount(Account tk){
        System.out.print("Nhap so tai khoan: ");
        tk.setSotk(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten tai khoan: ");
        tk.setTentk(sc.nextLine());
        tk.setSotien(50);
    }
}

