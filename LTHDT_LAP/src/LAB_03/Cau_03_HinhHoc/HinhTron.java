/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_03_HinhHoc;

/**
 *
 * @author TAMTRAN
 */
public class HinhTron {
    private int BanKinh;

    public HinhTron() {
        BanKinh=0;
    }

    public HinhTron(int BanKinh) {
        this.BanKinh = BanKinh;
    }
    public HinhTron(HinhTron ht) {
        BanKinh = ht.BanKinh;
    }

    public int getBanKinh() {
        return BanKinh;
    }

    public void setBanKinh(int BanKinh) {
        this.BanKinh = BanKinh;
    }

    public float S(){
        return (float) (3.14*BanKinh*BanKinh);
    }
    
    @Override
    public String toString(){
        return "Ban Kinh = " + this.BanKinh + "\nDien Tich Hinh Tron = " + this.S();
    }
}
