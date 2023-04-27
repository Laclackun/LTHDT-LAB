/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_01.Cau_1B;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangThucPham htp = new HangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.print("Nhập mã hàng : ");
        htp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do {
            System.out.print("Nhập tên hàng : ");
            htp.setTenHang(scanner.nextLine());
        } while (htp.kiemTraTenHang(kt));
        System.out.print("Nhập đơn giá : ");
        htp.setDonGia(scanner.nextDouble());
        do {
            System.out.print("Nhập năm, tháng, ngày sản xuất : ");
            htp.setNgaySanXuat(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.print("nhập năm,tháng,ngày hết hạn : ");
            htp.setNgayHetHan(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (htp.kiemTraNgay(th));
        System.out.println(htp);
        htp.kiemTraNgayHetHan();
    }
}
