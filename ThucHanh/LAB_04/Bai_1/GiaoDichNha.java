/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_1;

/**
 *
 * @author TAMTRAN
 */
public class GiaoDichNha extends GiaoDich {
    private String diaChi;
    private String loaiNha;
    
    public GiaoDichNha(String diaChi, String loaiNha, String maGD, double donGia, double dienTich, NgayThang namGD) {
        super(maGD, donGia, dienTich, namGD);
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }
    
    @Override
    public double tinhThanhTien(){
        if (loaiNha.equalsIgnoreCase("Cao Cap"))
            return getDienTich() * getDonGia();
        else
            return getDienTich() * getDonGia() * 0.9;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
}
