/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_1;

/**
 *
 * @author TAMTRAN
 */
abstract class GiaoDich {
    private String maGD;
    private double donGia;
    private double dienTich;
    private NgayThang namGD;

    public GiaoDich(String maGD, double donGia, double dienTich, NgayThang namGD) {
        this.maGD = maGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.namGD = namGD;
    }
    
    public abstract double tinhThanhTien();
    
    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public NgayThang getNamGD() {
        return namGD;
    }

    public void setNamGD(NgayThang namGD) {
        this.namGD = namGD;
    }
}
