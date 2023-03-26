*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_03;

/**
 *
 * @author TAMTRAN
 */
public class GiaoDichTienTe extends GiaoDich {
    private float tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe() {
        this.tiGia = 0;
        this.loaiTienTe = null;
    }

    public GiaoDichTienTe(float tiGia, String loaiTienTe, double donGia, double thanhTien, int maGiaoDich, int soLuong, String ngayGiaoDich) {
        super(donGia, thanhTien, maGiaoDich, soLuong, ngayGiaoDich);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }
    
    public double ThanhTien(){
        if(loaiTienTe == "VND"){
            return this.thanhTien = this.donGia * this.soLuong;
        }else{
            return this.thanhTien = this.donGia * this.soLuong * this.tiGia;
        }
    }   
}
