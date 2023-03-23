/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC_05.Cau_02;
import java.util.Scanner;

/**
 *
 * @author TAMTRAN
 */
public class HinhTron extends Hinh {
    private float r;

    public HinhTron() {
        this.r = 0;
    }

    public HinhChuNhat(float r) {
        this.r = r;
    }

    public float getr() {
        return r;
    }

    public void setr(float r) {
        this.r = r;
    }

    public void nhapHinhTron(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Xin Hay Nhap r = ");
        r = sc.nextFloat();
    }

    @Override
    public double dienTich() {
        return r*r*PI;
    }

    @Override
    public String toString() {
        return "Hinh Tron co r = " + r + "Va co S = " + dienTich();
    }
