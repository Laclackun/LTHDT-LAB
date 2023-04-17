*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_07.Cau_01;

/**
 *
 * @author TAMTRAN
 */

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("May Bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    public void catCanh(){
        System.out.println("Cat canh");
    }
    public void haCanh(){
        System.out.println("Ha canh");
    }
    
    @Override
    public double layVanToc(){
        return 1000;
    }
}
