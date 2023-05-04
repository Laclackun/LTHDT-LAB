/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02.Bai_1;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
public class Account {
    public double sotien;
    public long sotk;
    public String tentk;
    public String trangthai;
    
    Scanner sc = new Scanner(System.in);
    
    public Account() {
        this.sotien = 50;
        this.sotk = 999999;
        this.tentk = "chưa xác định";
        this.trangthai = "";
    }

    public Account(double sotien, int sotk, String tentk, String trangthai) {
        this.sotien = sotien;
        this.sotk = sotk;
        this.tentk = tentk;
        this.trangthai = trangthai;
        if (sotien <= 50)
            System.out.print("So tien trong tai khoan khong hop le, toi thieu phai lon hon 50.");
        if (sotk <= 0 && sotk == 999999)
            System.out.print("So tai khoan nay khong hop le.");
        if (tentk==null)
            System.out.print("Ten tai khoan nay khong duoc trong.");
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String sotienformat = formatter.format(sotien);
        return "Thông Tin Tài Khoản: " + 
                "\nSo Tai Khoan: " + sotk + 
                "\nTen Tai Khoan: " + tentk +
                "\nSo Tien Hien Co: " + sotienformat +
                "\nTrang Thai: " + trangthai;
        
    }

    public double getSotien() {
            return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    public long getSotk() {
        return sotk;
    }

    public void setSotk(long sotk) {
        this.sotk = sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
     public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        //nếu số tiền nạp vào lớn hơn 0 thì hợp lệ
        if (nap >= 0) {
            sotien = nap + sotien;
            Locale local = new Locale("vi", "vn");
            NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
            String sotienformat = formatter.format(nap);
            System.out.println("bạn vừa nạp " + sotienformat + " vào tài khoản.");
        } else {//ngược lại nếu số tiền nộp vào bé hơn 0 thì không hợp lệ
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
 
    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        //nếu số tiền rút bé hơn hoặc bằng số tiền còn trong tài khoản + phí thì hợp lệ
        if (rut <= (sotien - phi)) {
            sotien = sotien - (rut + phi);
            Locale local = new Locale("vi", "vn");
            NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
            String sotienformat = formatter.format(rut);
            System.out.println("Bạn vừa rút " + sotienformat + "Đ từ tài khoản. Phí là $5.");
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }

    void inTK() {
        Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String sotienformat = formatter.format(sotien);
        System.out.printf("%-10d %-20s %-20s %-10s\n", sotk, tentk, sotienformat, trangthai);
    }
}
