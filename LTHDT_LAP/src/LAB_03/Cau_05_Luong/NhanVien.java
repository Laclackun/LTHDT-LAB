/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_05_Luong;

/**
 *
 * @author TAMTRAN
 */
public class NhanVien {
     private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

    public NhanVien() {
        this.tenNhanVien=null;
        this.luongCoBan=0;
        this.heSoLuong=0;
        this.LUONG_MAX=0;
    }

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }
    
    
    public boolean tangLuong(double a){
        if(((heSoLuong+a)*luongCoBan)>LUONG_MAX){
            System.out.println("He so luong khong hop le!!");
            return false;
        } else {
            heSoLuong+=a;
            return true;
        }
        
    }
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    }
    
    public void inTTin(){
        System.out.println("Ten nhan vien: "+tenNhanVien);
        System.out.println("Luong co ban: "+luongCoBan);
        System.out.println("He so luong: "+heSoLuong);
        System.out.println("Luong Max: "+ LUONG_MAX);
    }
}
