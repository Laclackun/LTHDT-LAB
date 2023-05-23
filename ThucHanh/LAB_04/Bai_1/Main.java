/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Bai_1;

/**
 *
 * @author TAMTRAN
 */
public class Main {
    public static void main(String[] args){
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();
        qlgd.themGiaoDich(new GiaoDichDat("A", "Dat1", 5000, 100, new NgayThang(20,9,2016)));
        qlgd.themGiaoDich(new GiaoDichDat("B", "Dat2", 4000, 200, new NgayThang(13,9,2013)));
        qlgd.themGiaoDich(new GiaoDichDat("C", "Dat3", 3000, 300, new NgayThang(12,12,2013)));
        
        qlgd.themGiaoDich(new GiaoDichNha("123 Thành Thái","Cao Cap" , "Nha1", 1000, 500, new NgayThang(19,9,2013)));
        qlgd.themGiaoDich(new GiaoDichNha("ABC Hà Vọng Xuyên","Thuong" , "Nha2", 300, 100, new NgayThang(29,9,2013)));
        
        qlgd.xuatdsGD();
        
        int SLGDDat = qlgd.demSLGDDat();
        System.out.println("So Luong Giao Dich Dat: " + SLGDDat);
        
        int SLGDNha = qlgd.demSLGDNha();
        System.out.println("So Luong Giao Dich Nha: " + SLGDNha);
        
        System.out.println("Trung Binh Thanh Tien Giao Dich Dat: " + qlgd.tinhTrBThanhTienGDDat());
        
        qlgd.xuatdsGDT9();
    }
}
