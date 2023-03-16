/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_06.Cau_02;

/**
 *
 * @author TAMTRAN
 */
public class main {
   public static void main (String [] args){
      
      HocSinh hs=new HocSinh("Vy", "10A2", 8, 9, 6);
      System.out.println( "Diem cua hoc sinh la " + hs.diemTrungBinh());

      HocSinhChuyenToan hs1 = new HocSinhChuyenToan("Hoa", "10A6", 10, 7, 8);
      System.out.println( "Diem cua hoc sinh chuyen toan la " + hs1.diemTrungBinh());
   }
}
