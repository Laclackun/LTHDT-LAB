/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_07.Cau_01;

/**
 *
 * @author TAMTRAN
 */

public class XeDap extends PhuongTienDiChuyen{

    public XeDap(HangSanXuat hangSanXuat) {
        super("Xe dap", hangSanXuat);
    }
    
    @Override
    public double layVanToc(){
        return 30;
    }
}
