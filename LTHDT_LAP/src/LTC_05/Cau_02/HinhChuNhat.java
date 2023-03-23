/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_02;

/**
 *
 * @author TAMTRAN
 */
public class HinhChuNhat extends Hinh {
    private float cd;
    private float cr;

    public HinhChuNhat() {
        this.cd = 0;
        this.cr = 0;
    }

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double getcd() {
        return cd;
    }

    public double getcr() {
        return cr;
    }

    public void setcd(double cd) {
        this.cd = cd;
    }

    public void setcr(double cr) {
        this.cr = cr;
    }

    @Override
    public double dienTich() {
        return cd*cr;
    }

    @Override
    public String toString() {
        return "Hinh Chu Nhat co cd = " + cd + "co cr =" + cr + "Va co S = " + dienTich();
    }
}
