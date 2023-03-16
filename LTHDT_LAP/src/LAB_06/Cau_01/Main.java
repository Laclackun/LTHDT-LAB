/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_06.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class Main {
    public static void main (String [] args){
      
      NhanVien nv = new NhanVien("Minh", 5000);
      
      NhanVienPartTime nvp = new NhanVienPartTime("Minh", 3, 5000);
      nvp.xuatThongTin();
      nvp.tinhLuong();
      
      NhanVienFullTime nvf = new NhanVienFullTime("Ly", 3, 4, 7000);
      nvf.xuatThongTin();
      nvf.tinhLuong();
   }
}
