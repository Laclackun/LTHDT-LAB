/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC4.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class CamCaoPhong extends QuaCam {
    private String lop;
    
    public CamCaoPhong(String lop, String xuatKhau, double gia, double can, double SL) {
        super(xuatKhau, gia, can, SL);
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    
}
