/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAMTRAN
 */
public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public void xuatDanhSachGiaoDich() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            System.out.printf("%-6s | %-10s | %10s | %10s | %15s \n",
                    "Ma GD", "Ngay GD", "Dien Tich", "Don Gia", "Thanh Tien");
            System.out.printf("%-6s | %-10s | %10s | %10s | %15s \n",
                    giaodich.getMaGD(), giaodich.getNamGD(), giaodich.getDonGia(), giaodich.getDienTich(), giaodich.tinhThanhTien());
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public int demSoLuongGiaoDichDat() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongGiaoDichNha() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichNha) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienGiaoDichDat() {
        double tongThanhTien = 0;
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                tongThanhTien += giaoDich.tinhThanhTien();
                count++;
            }
        }
        if (count > 0) {
            return tongThanhTien / count;
        } else {
            return 0;
        }
    }

    public void xuatGiaoDichThang9Nam2013() {
        System.out.println("Các giao dịch trong tháng 9 năm 2013:");
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.getNamGiaoDich().getThang() == 9 && giaoDich.getNamGiaoDich().getNam() == 2013) {
                System.out.println("Mã giao dịch: " + giaoDich.getMaGiaoDich());
                System.out.println("Ngày giao dịch: " + giaoDich.getNamGiaoDich());
                System.out.println("Diện tích: " + giaoDich.getDienTich());
                System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
                System.out.println("-------------------------------------");
            }
        }
    }
}
