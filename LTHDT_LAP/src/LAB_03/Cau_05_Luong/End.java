/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_05_Luong;

/**
 *
 * @author TAMTRAN
 */
public class End {
    public static void main(String[] args) {
        NhanVien nv=new NhanVien("Vy",4000,3,100000);
        
        nv.tangLuong(2.5);
        nv.inTTin();
        System.out.println("Luong nhan vien "+ nv.getTenNhanVien() + ": "+ nv.tinhLuong());
    }
}
