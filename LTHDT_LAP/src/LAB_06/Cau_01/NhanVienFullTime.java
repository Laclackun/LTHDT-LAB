/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_06.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class NhanVienFullTime extends NhanVien {
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem) {
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    public NhanVienFullTime(String ten, int loaiChucVu, int ngayLamThem, long luong) {
        super(ten, luong);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    @Override
    public void loaiNhanVien(){
        System.out.println("Loai Nhan Vien: FullTime.");
    }
    
    @Override
    public void tinhLuong(){
        System.out.println("Luong cua " + ten + "thang nay la " + luong*loaiChucVu*ngayLamThem);
    }
    
    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }   
}
