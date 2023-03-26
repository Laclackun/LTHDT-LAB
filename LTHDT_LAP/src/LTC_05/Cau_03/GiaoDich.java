/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_03;

/**
 *
 * @author TAMTRAN
 */
public class GiaoDich {
    public double donGia;
    public double thanhTien;
    public double maGiaoDich;
    public double soLuong;
    public String ngayGiaoDich;

    public GiaoDich() {
        this.donGia = 0;
        this.thanhTien = 0;
        this.maGiaoDich = 0;
        this.soLuong = 0;
        this.ngayGiaoDich = null; 
    }
  
    public GiaoDich(double donGia, double thanhTien, int maGiaoDich, int soLuong, String ngayGiaoDich) {
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.maGiaoDich = maGiaoDich;
        this.soLuong = soLuong;
        this.ngayGiaoDich = ngayGiaoDich;
    }
    
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
}
