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

    public ChuyenXe() {
       this.noiDen = null;
       this.soNgayDiDuoc = 0;

    public ChuyenXeNgoaiThanh(String hoTenTX, double maSoChuyen, double soXe, double doanhThu, String noiDen, double soNgayDiDuoc) {
       super(hoTenTX, maSoChuyen, soXe, doanhThu);
       this.noiDen=noiDen;
       this.soNgayDiDuoc=soNgayDiDuoc;
    }

    @Override
    public void loaiChuyenXe(){
        System.out.println("Loai Chuyen Xe: Ngoai Thanh.");
    }

    public String NoiDen() {
        return noiDen;
    }

    public void NoiDen(String hoTenTX) {
        this.noiDen = noiDen;
    }

    public String SoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void SoNgayDiDuoc(String soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
