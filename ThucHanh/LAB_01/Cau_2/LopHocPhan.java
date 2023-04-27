/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_01.Cau_2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
public class LopHocPhan {
    public String maLHP, tenLHP, tenGV, thongTinLopHoc;
    
    ArrayList<SinhVien> dsSV = new ArrayList();
    
    public LopHocPhan(){
        dsSV = new ArrayList();
    }
    
    public int getSoLuongSV(){
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
            count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "- Ma LHP: " + maLHP +
               "\n- Ten LHP: " + tenLHP +
               "\n- GV giang day: " + tenGV +
                "\n- Thong tin buoi hoc: " + thongTinLopHoc +
                "\n\nDanh sach sinh vien " + dsSV;
    }

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
}
