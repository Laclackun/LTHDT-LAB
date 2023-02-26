/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_03_HinhHoc;

/**
 *
 * @author TAMTRAN
 */
public class End {
    public static void main(String[] args) {
        HinhChuNhat HCN = new HinhChuNhat(7,3);
        HCN.DienTich();
        System.out.println(HCN.toString());
        
        var HT = new HinhTron (5);
        HT.S();
        System.out.println(HT.toString());
    }
}
