/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class ChuyenXe {
    private String hoTenTX;
    private double maSoChuyen;
    private double soXe;
    private double doanhThu;

    public ChuyenXe() {
       this.hoTenTX = null;
       this.maSoChuyen = 0;
       this.soXe = 0;
       this.doanhThu = 0;
    }

    public ChuyenXe(String hoTenTX, double maSoChuyen, double soXe, double doanhThu) {
       this.hoTenTX=hoTenTX;
       this.maSoChuyen=maSoChuyen;
       this.soXe=soXe;
       this.doanhThu=doanhThu;
    }

    public void loaiChuyenXe(){
        System.out.println("Loai Chuyen Xe:");
    }

    public void thongTinChuyen(){
        System.out.println("Ten Tai Xe: " + hoTenTX);
        System.out.println("So Xe: " + soXe);
        System.out.println("Ma So Chuyen: " + maSoChuyen);
        loaiChuyenXe();
        System.out.println("Co Doanh Thu: " + doanhThu); 
    }


    public String HoTenTX() {
        return hoTenTX;
    }

    public void HoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public double MaSoChuyen() {
        return maSoChuyen;
    }

    public void MaSoChuyen(double maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public double SoXe() {
        return soXe;
    }

    public void SoXe(double soXe) {
        this.soXe = soXe;
    }

    public double doanhThu() {
        return doanhThu;
    }

    public void doanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }


