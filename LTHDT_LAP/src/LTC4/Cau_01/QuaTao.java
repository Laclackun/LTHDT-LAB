/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC4.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class QuaTao extends HoaQua {
    private String xuatXu;
    
    public QuaTao(String xuatXu, double gia, double can, double SL) {
        super(gia, can, SL);
        this.xuatXu = xuatXu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    
}
