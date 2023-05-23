/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_2;

/**
 *
 * @author TAMTRAN
 */

public class Main {
    public static void main(String[] args) {
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon();

        // Thêm các hoá đơn vào danh sách
        quanLyHoaDon.themHoaDon(new KhachHangVietNam("KHVN001", "Nguyen Van A", new NgayThang(1, 9, 2013), "Sinh Hoat", 100, 2000, 50));
        quanLyHoaDon.themHoaDon(new KhachHangVietNam("KHVN002", "Nguyen Thi B", new NgayThang(2, 9, 2013), "Kinh Doanh", 200, 2000, 100));
        quanLyHoaDon.themHoaDon(new KhachHangNuocNgoai("KHN001", "John Smith", new NgayThang(3, 9, 2013), "USA", 150, 2500));

        // Xuất danh sách hoá đơn
        quanLyHoaDon.xuatDanhSachHoaDon();

        // Tính tổng số lượng cho từng loại khách hàng
        int soLuongKhachHangVietNam = quanLyHoaDon.demSoLuongKhachHangVietNam();
        int soLuongKhachHangNuocNgoai = quanLyHoaDon.demSoLuongKhachHangNuocNgoai();
        System.out.println("So Luong Khach Hang VN: " + soLuongKhachHangVietNam);
        System.out.println("So Luong Khach Hang Nuoc Ngoai: " + soLuongKhachHangNuocNgoai);

        // Tính trung bình thành tiền của khách hàng người nước ngoài
        double trungBinhThanhTienKhachHangNuocNgoai = quanLyHoaDon.tinhTrungBinhThanhTienKhachHangNuocNgoai();
        System.out.println("Trung bình thành tiền của khách hàng người nước ngoài: " + trungBinhThanhTienKhachHangNuocNgoai);

        // Xuất các hoá đơn trong tháng 09 năm 2013
        quanLyHoaDon.xuatHoaDonThang9Nam2013();
    }
}
