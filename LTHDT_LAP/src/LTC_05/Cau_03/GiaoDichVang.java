/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_03;

/**
 *
 * @author TAMTRAN
 */
public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang() {
        this.loaiVang = null;
    }

    public GiaoDichVang(String loaiVang, double donGia, double thanhTien, int maGiaoDich, int soLuong, String ngayGiaoDich) {
        super(donGia, thanhTien, maGiaoDich, soLuong, ngayGiaoDich);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    public double ThanhTien(){
        return this.thanhTien = this.soLuong * this.donGia;
    }
}
