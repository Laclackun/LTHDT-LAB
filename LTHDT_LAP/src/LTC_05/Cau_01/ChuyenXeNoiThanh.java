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

    public ChuyenXeNoiThanh() {
       this.soTuyen = null;
       this.soKmDiDuoc = 0;
    }

    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc, String hoTenTX, double maSoChuyen, double soXe, double doanhThu) {
        super(hoTenTX, maSoChuyen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void loaiChuyenXe(){
        System.out.println("Loai Chuyen Xe: Noi Thanh.");
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
}
