/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_06.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class NhanVien {
    private String ten;
    private String loai;
    private long luong;

    public NhanVien() {
        this.ten = null;
        this.loai = null;
        this.luong = 0;
    }

    public NhanVien(String ten, String loai, long luong) {
        this.ten = ten;
        this.loai = loai;
        this.luong = luong;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    public String getLoai(){
        return loai;
    }
    
    public void tinhLuong(){
        System.out.println("Luong cua " + ten + "thang nay la " + luong);
    }
    
    public void xuatThongTin(){
        System.out.println("Ten Nhan Vien: " + ten);
        System.out.println("Loai Nhan Vien: " + loai);
        System.out.println("Co Muc Luong: " + luong);
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }  
}
