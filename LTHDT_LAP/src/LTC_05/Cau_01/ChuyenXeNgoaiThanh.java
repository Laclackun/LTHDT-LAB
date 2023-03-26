/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private double soNgayDiDuoc;

    public ChuyenXeNgoaiThanh() {
       this.noiDen = null;
       this.soNgayDiDuoc = 0;
    }

    public ChuyenXeNgoaiThanh(String noiDen, double soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public ChuyenXeNgoaiThanh(String noiDen, double soNgayDiDuoc, String hoTenTX, double maSoChuyen, double soXe, double doanhThu) {
        super(hoTenTX, maSoChuyen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void loaiChuyenXe(){
        System.out.println("Loai Chuyen Xe: Ngoai Thanh.");
    }
    
    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(double soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
}    
