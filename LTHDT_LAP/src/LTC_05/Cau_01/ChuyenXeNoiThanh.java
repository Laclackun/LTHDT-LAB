/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;

    public ChuyenXe() {
       this.soTuyen = 0;
       this.soKmDiDuoc = 0;

    public ChuyenXeNgoaiThanh(String hoTenTX, double maSoChuyen, double soXe, double doanhThu, String soTuyen, double soKmDiDuoc) {
       super(hoTenTX, maSoChuyen, soXe, doanhThu);
       this.soTuyen=soTuyen;
       this.soKmDiDuoc=soKmDiDuoc;
    }

    @Override
    public void loaiChuyenXe(){
        System.out.println("Loai Chuyen Xe: Noi Thanh.");
    }

    public String soTuyen() {
        return soTuyen;
    }

    public void soTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public String SoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void SoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    
