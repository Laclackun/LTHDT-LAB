/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC4.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class CamSanh extends QuaCam {
    private String loai;
    
    public CamSanh(String loai, String xuatKhau, double gia, double can, double SL) {
        super(xuatKhau, gia, can, SL);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
}
