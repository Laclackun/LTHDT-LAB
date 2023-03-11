/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC4.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class QuaCam extends HoaQua {
    private String xuatKhau;
    
    public QuaCam(String xuatKhau, double gia, double can, double SL) {
        super(gia, can, SL);
        this.xuatKhau = xuatKhau;
    }

    public String getXuatKhau() {
        return xuatKhau;
    }

    public void setXuatKhau(String xuatKhau) {
        this.xuatKhau = xuatKhau;
    }
    
    
}
