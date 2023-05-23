/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_03;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAMTRAN
 */

public class DiemHocVien {
    private String hoTen;
    private int namSinh;
    private List<Integer> diem;

    public DiemHocVien(String hoTen, int namSinh, List<Integer> diem) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public boolean lamLuanVanTotNghiep() {
        return diemTrungBinh() > 7 && !coMonDuoi5Diem();
    }

    public boolean totNghiep() {
        return diemTrungBinh() <= 7 && !coMonDuoi5Diem();
    }

    public boolean thiLai() {
        return coMonDuoi5Diem();
    }

    public List<String> monThiLai() {
        List<String> monThiLai = new ArrayList<>();
        for (int i = 0; i < diem.size(); i++) {
            if (diem.get(i) < 5) {
                monThiLai.add("Mon " + (i + 1));
            }
        }
        return monThiLai;
    }

    private double diemTrungBinh() {
        int sum = 0;
        for (int d : diem) {
            sum += d;
        }
        return (double) sum / diem.size();
    }

    private boolean coMonDuoi5Diem() {
        for (int d : diem) {
            if (d < 5) {
                return true;
            }
        }
        return false;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public List<Integer> getDiem() {
        return diem;
    }

    public void setDiem(List<Integer> diem) {
        this.diem = diem;
    }
}

