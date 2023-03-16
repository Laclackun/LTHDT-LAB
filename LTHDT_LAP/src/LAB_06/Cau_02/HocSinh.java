/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_06.Cau_02;

/**
 *
 * @author TAMTRAN
 */
public class HocSinh {
    private String hoTen;
    private String lop;
    private float toan;
    private float ly;
    private float hoa;

    public HocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
    this.hoTen=hoTen;
    this.lop=lop;
    this.toan=toan;
    this.ly=ly;
    this.hoa=hoa;
    }

    public String hoTen() {
        return hoTen;
    }

    public void hoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String lop() {
        return lop;
    }

    public void lop(String lop) {
        this.lop = lop;
    }

    public float toan() {
        return toan;
    }

    public void toan(float toan) {
        this.toan = toan;
    }

    public float ly() {
        return ly;
    }

    public void ly(float ly) {
        this.ly = ly;
    }

    public float hoa() {
        return hoa;
    }

    public void hoa(float hoa) {
        this.hoa = hoa;
    }

    public float diemTrungBinh (){
    return (toan+ly+hoa)/3;
    }
}
