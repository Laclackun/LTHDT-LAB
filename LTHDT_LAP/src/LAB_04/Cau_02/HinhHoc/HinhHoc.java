/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Cau_02.HinhHoc;
import java.util.Scanner;

/**
 *
 * @author TAMTRAN
 */
public class HinhHoc {
    public float Pi = (float) 3.14;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    public HinhHoc (float Pi, String ten, float chuVi, float dienTich, float theTich){
        this.Pi = Pi;
        this.ten = ten;
        this.chuVi = chuVi;
        this.dienTich = dienTich;
        this.theTich = theTich;
    }
    public void xuatTen(){
        System.out.println(ten);
    }
    public void inChuVi(){
        System.out.println("Vay chu vi la = " + chuVi);
    }
    public void inDienTich(){
           System.out.println("Vay dien tich la = " + dienTich);
    }
    public void inTheTich(){
        System.out.println("Vay the tich la = " + theTich);
    }
    
    public class HinhTron extends HinhHoc{
        private float banKinh;
        public HinhTron(float banKinh, float Pi, String ten, float chuVi, float dienTich, float theTich) {
            super(Pi, ten, chuVi, dienTich, theTich);
            this.banKinh = banKinh;
        }
        public void nhapBanKinh(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ban kinh = ");
            banKinh = sc.nextFloat();
        }
        public void tinhChuVi(){
            chuVi = 2 * Pi * banKinh;
        }
        public void tinhDienTich(){
            dienTich = Pi * banKinh * banKinh;
        }
    }
    
    public class HinhTru extends HinhTron{
        private float chieuCao;
        public HinhTru(float chieuCao, float banKinh, float Pi, String ten, float chuVi, float dienTich, float theTich) {
            super(banKinh, Pi, ten, chuVi, dienTich, theTich);
            this.chieuCao = chieuCao;
        }
        
        public void nhapChieuCao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao = ");
        chieuCao = sc.nextFloat();
        }
        public void tinhTheTich(){
            tinhDienTich();
            theTich = dienTich * chieuCao;
        }
        
    }
    
    public class HinhChuNhat extends HinhHoc{
        private float dai;
        private float rong;
        public HinhChuNhat(float dai, float rong, float Pi, String ten, float chuVi, float dienTich, float theTich) {
            super(Pi, ten, chuVi, dienTich, theTich);
            this.dai = dai;
            this.rong = rong;
        }
        
        public void nhapChieuDai(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap chieu dai = ");
            dai = sc.nextFloat();
        }
        public void nhapChieuRong(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap chieu rong = ");
            rong = sc.nextFloat();
        }
        public void tinhChuVi(){
            chuVi = (dai + rong) * 2;
        }
        public void tinhDienTich(){
            dienTich = dai * rong;
        }
    }
    
    public class HinhVuong extends HinhChuNhat{
        public HinhVuong(float dai, float rong, float Pi, String ten, float chuVi, float dienTich, float theTich) {
            super(dai, rong, Pi, ten, chuVi, dienTich, theTich);
        }
        public void nhapCanh(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap chieu dai cua canh = ");
            dai = rong = sc.nextFloat();
        }
    }
}
