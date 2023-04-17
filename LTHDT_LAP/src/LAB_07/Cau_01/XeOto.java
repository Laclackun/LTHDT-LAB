/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_07.Cau_01;

/**
 *
 * @author TAMTRAN
 */

public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOto(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("O to", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    @Override
    public double layVanToc(){
        return 120;
    }
    
}
