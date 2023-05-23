/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAMTRAN
 */
public class QuanLyGiaoDich {
    private List<GiaoDich> dsGD;
    
    public QuanLyGiaoDich(){
        dsGD = new ArrayList<>();
    }
    
    public void themGiaoDich(GiaoDich giaodich) {
        dsGD.add(giaodich);
    }
    
    public void xuatdsGD(){
        for (GiaoDich giaodich : dsGD) {
            System.out.printf("%-6s | %-15s | %-10s | %10s | %15s \n",
                    "Ma GD", "Ngay GD", "Dien Tich", "Don Gia", "Thanh Tien");
            System.out.printf("%-6s | %-15s | %-10s | %10s | %15s \n",
                    giaodich.getMaGD(), giaodich.getNamGD(), giaodich.getDienTich(), giaodich.getDonGia(), giaodich.tinhThanhTien());
            System.out.println("--------------------------------------------------------------");
        }
    }
    
    public int demSLGDDat(){
        int count = 0;
        for (GiaoDich giaodich : dsGD) {
            if (giaodich instanceof GiaoDichDat)
                count++;
        }
        return count;
    }
    
    
    public int demSLGDNha(){
        int count = 0;
        for (GiaoDich giaodich : dsGD) {
            if (giaodich instanceof GiaoDichNha)
                count++;
        }
        return count;
    }
    
    public double tinhTrBThanhTienGDDat (){
        double tongThanhTien = 0;
        int count = 0;
        for (GiaoDich giaodich : dsGD) {
            if(giaodich instanceof GiaoDichDat){
                tongThanhTien = tongThanhTien + giaodich.tinhThanhTien();
                count ++;
            }
        }
        if (count > 0)
            return tongThanhTien / count;
        else
            return 0;
    }
    
    public void xuatdsGDT9(){
        System.out.println("Cac GD Co Trong Thang 9 Nam 2013 la: ");
        for (GiaoDich giaodich : dsGD) {
            if (giaodich.getNamGD().getThang() == 9 && giaodich.getNamGD().getNam() == 2013){
                            System.out.printf("%-6s | %-15s | %-10s | %10s | %15s \n",
                    "Ma GD", "Ngay GD", "Dien Tich", "Don Gia", "Thanh Tien");
            System.out.printf("%-6s | %-15s | %-10s | %10s | %15s \n",
                    giaodich.getMaGD(), giaodich.getNamGD(), giaodich.getDienTich(), giaodich.getDonGia(), giaodich.tinhThanhTien());
            System.out.println("--------------------------------------------------------------");
            }
        }
    }
}
