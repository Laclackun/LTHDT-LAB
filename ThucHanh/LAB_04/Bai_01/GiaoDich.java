/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_01;

/**
 *
 * @author TAMTRAN
 */

abstract class GiaoDich {
    private String maGiaoDich;
    private NgayThang namGiaoDich;
    private double donGia;
    private double dienTich;

    public GiaoDich(String maGiaoDich, NgayThang namGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.namGiaoDich = namGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public NgayThang getNamGiaoDich() {
        return namGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public abstract double tinhThanhTien();
}

class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, NgayThang namGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiDat.equalsIgnoreCase("A")) {
            return getDienTich() * getDonGia() * 15;
        } else {
            return getDienTich() * getDonGia();
        }
    }
}

class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, NgayThang namGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cap")) {
            return getDienTich() * getDonGia();
        } else {
            return getDienTich() * getDonGia() * 0.9;
        }
    }
}

class NgayThang {
    private int ngay;
    private int thang;
    private int nam;

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}


