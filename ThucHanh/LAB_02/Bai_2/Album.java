/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02.Bai_2;

/**
 *
 * @author TNMT
 */
public class Album {
    //khai báo các thuộc tính
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBH;
    private float giaThanh;
    //khởi tạo constructor mặc định
    public Album() {
    }
    //khởi tạo constructor có tham số
    public Album(int cD, String tenCD, String caSy, int soBH, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }
    //------------begin getter and setter--------------
    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String getTenCD() {
        return tenCD;
    }
 
    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBH() {
        return soBH;
    }
 
    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }
 
    public float getGiaThanh() {
        return giaThanh;
    }
 
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    //------------end getter and setter--------------
    @Override
    public String toString() {
        return "--- Album CD ---" +
                "Mã CD = \n" + maCD +
                "Tên CD = \n" + tenCD +
                "Tên Ca Sỹ = \n" + caSy +
                "Số Bài Hát = \n" + soBH +
                "Giá Thành = \n" + giaThanh;
    }
    //khởi tạo phương thức hiện thị theo format
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tenCD,caSy,soBH,giaThanh);
    }

}
