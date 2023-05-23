/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_1;

/**
 *
 * @author TAMTRAN
 */
public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    
    public GiaoDichDat(String loaiDat, String maGD, double donGia, double dientich, NgayThang namGD) {
        super(maGD, donGia, dientich, namGD);
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhThanhTien(){
        if (loaiDat.equalsIgnoreCase("A"))
            return getDienTich() * getDonGia()*15;
        else
            return getDienTich() * getDonGia();
    }
    
    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
}
