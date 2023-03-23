/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_02;

/**
 *
 * @author TAMTRAN
 */
public class Main {
    public static void main(String[] args) {
        
        HinhChuNhat HCN = new HinhChuNhat();
        HCN.nhapHinhChuNhat();
        System.out.println(HCN.toString());
        
        HinhTron HT = new HinhTron ();
        HT.nhapHinhTron();
        System.out.println(HT.toString());
    }
}
