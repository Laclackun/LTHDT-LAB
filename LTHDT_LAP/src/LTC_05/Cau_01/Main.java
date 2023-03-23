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
      
      ChuyenXe nv = new ChuyenXe("An Nam", 8164, 4449, 5000);
      
      ChuyenXeNgoaiThanh cxngoai = new ChuyenXeNgoaiThanh("Hòa An", 18164, 2149, 15000, "Chính Thành", 4);
      cxngoai.thongTinChuyen();
      cxngoai.NoiDen();
      
      ChuyenXeNoiThanh cxnoi = new ChuyenXeNoiThanh("Thanh Hóa", 1423, 1149, 45000, "A23HU", 12);
      cxnoi.thongTinChuyen();
      cxnoi.SoTuyen();
   }
}
