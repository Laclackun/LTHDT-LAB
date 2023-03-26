/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class Main {
    public static void main (String [] args){
      
      ChuyenXe cx = new ChuyenXe("An Nam", 8164, 4449, 5000);
      cx.thongTinChuyen();
      
      ChuyenXeNgoaiThanh cxngoai = new ChuyenXeNgoaiThanh("Chính Thành", 4, "Hòa An", 18164, 2149, 15000);
      cxngoai.thongTinChuyen();
      
      ChuyenXeNoiThanh cxnoi = new ChuyenXeNoiThanh("A23HU", 12, "Thanh Hóa", 1423, 1149, 45000);
      cxnoi.thongTinChuyen();
   }
}
