/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_01;

/**
 *
 * @author TAMTRAN
 */
public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich();

        quanLyGiaoDich.themGiaoDich(new GiaoDichDat("GD001", new NgayThang(10, 9, 2013), 100, 200, "A"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichDat("GD002", new NgayThang(15, 9, 2013), 150, 300, "B"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD003", new NgayThang(20, 9, 2013), 200, 400, "cao cap", "123 ABC Street"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD004", new NgayThang(25, 9, 2013), 250, 500, "thường", "456 XYZ Street"));

        quanLyGiaoDich.xuatDanhSachGiaoDich();

        int soLuongGiaoDichDat = quanLyGiaoDich.demSoLuongGiaoDichDat();
        System.out.println("Số lượng giao dịch đất: " + soLuongGiaoDichDat);

        int soLuongGiaoDichNha = quanLyGiaoDich.demSoLuongGiaoDichNha();
        System.out.println("Số lượng giao dịch nhà: " + soLuongGiaoDichNha);

        double trungBinhThanhTienGiaoDichDat = quanLyGiaoDich.tinhTrungBinhThanhTienGiaoDichDat();
        System.out.println("Trung bình thành tiền giao dịch đất: " + trungBinhThanhTienGiaoDichDat);

        quanLyGiaoDich.xuatGiaoDichThang9Nam2013();
    }
}
