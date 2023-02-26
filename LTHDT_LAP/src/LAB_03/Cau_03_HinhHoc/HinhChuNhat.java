/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_03_HinhHoc;

/**
 *
 * @author TAMTRAN
 */
public class HinhChuNhat {
    private float dai;
    private float rong;

    public HinhChuNhat() {
        this.dai=0;
        this.rong=0;
    }

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public HinhChuNhat(HinhChuNhat hcn){
        dai = hcn.dai;
        rong = hcn.rong;
    }

    public float getdai() {
        return this.dai;
    }

    public void setdai(float dai) {
        this.dai = dai;
    }

    public float getrong() {
        return this.rong;
    }

    public void setrong(float rong) {
        this.rong = rong;
    }
    
    public float DienTich(){
        return this.dai * this.rong;
    }
    
    @Override
    public String toString(){
        return "Chieu Dai = "+ this.dai + "\nChieu Rong = "+this.rong + "\nDien Tich Hinh Chu Nhat = " + this.DienTich();
    }
}
