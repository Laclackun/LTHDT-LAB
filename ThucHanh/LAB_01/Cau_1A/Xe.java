/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_01.Cau_1A;

/**
 *
 * @author TNMT
 */
public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;
    
    public Xe() {
        this.tenChuXe = null;
        this.loaiXe = null;
        this.dungTich = 0;
        this.triGia = 0;
    }

    public Xe(String tenChuXe, String loaiXe, int dungTich, float triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }
    

    public float tinhThue() {
        if (dungTich<100) 
            return (triGia * (1/100));
                    
        if (dungTich >=100 & dungTich <= 200)
            return (triGia * (3/100));
                    
        else return (triGia * (5/100));
    }

    @Override
    public String toString() {
        return "Tên Chủ Xe      "  + "Loại Xe      " + "Dung Tích      " + "Trị Giá      " + "Thuế Phải Nộp" ;
    }

    public void DaiPhanCach() {
        System.out.printf("=========================================================================================");
    }

    void inThongTinXe(){
        System.out.printf("%20s %10s %d %10.2f %8.2f", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}
