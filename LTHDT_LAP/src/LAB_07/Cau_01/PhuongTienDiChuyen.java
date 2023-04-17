/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_07.Cau_01;

/**
 *
 * @author TAMTRAN
 */

abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    
    
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    
    public void batDau(){
        System.out.println("Bat dau");
    }
    public void tangtoc(){
        System.out.println("Tang toc");
    }
    public void dungLai(){
        System.out.println("Dung lai");
    }
    abstract double layVanToc(); 
}
