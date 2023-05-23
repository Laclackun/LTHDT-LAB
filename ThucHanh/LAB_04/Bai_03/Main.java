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

public class Main {
    public static void main(String[] args) {
        List<DiemHocVien> hocVienList = new ArrayList<>();
        hocVienList.add(new DiemHocVien("Nguyen Van A", 1990, List.of(8, 7, 6, 9, 8)));
        hocVienList.add(new DiemHocVien("Tran Thi B", 1992, List.of(7, 6, 7, 8, 9)));
        hocVienList.add(new DiemHocVien("Le Van C", 1991, List.of(6, 5, 4, 5, 6)));
        hocVienList.add(new DiemHocVien("Pham Thi D", 1993, List.of(9, 8, 7, 8, 9)));
        hocVienList.add(new DiemHocVien("Hoang Van E", 1990, List.of(8, 7, 8, 7, 9)));

        int soLuongLuanVanTotNghiep = 0;
        int soLuongTotNghiep = 0;
        int soLuongThiLai = 0;
        List<String> monThiLai = new ArrayList<>();

        for (DiemHocVien hocVien : hocVienList) {
            if (hocVien.lamLuanVanTotNghiep()) {
                soLuongLuanVanTotNghiep++;
            }
            if (hocVien.totNghiep()) {
                soLuongTotNghiep++;
            }
            if (hocVien.thiLai()) {
                soLuongThiLai++;
                monThiLai.addAll(hocVien.monThiLai());
            }
        }

        System.out.println("So nguoi lam luan van tot nghiep: " + soLuongLuanVanTotNghiep);
        System.out.println("So nguoi tot nghiep: " + soLuongTotNghiep);
        System.out.println("So nguoi phai thi lai: " + soLuongThiLai);
        System.out.println("Danh sach mon thi lai: " + monThiLai);
    }
}

