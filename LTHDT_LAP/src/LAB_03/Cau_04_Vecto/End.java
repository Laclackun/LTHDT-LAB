/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_04_Vecto;

/**
 *
 * @author TAMTRAN
 */
public class End {
    public static void main(String[] args) {
        Vector a = new Vector(1,2,3);
        Vector b = new Vector(3,2,1);
        a.add(b);
        System.out.println(a.getX() + a.getY() + a.getZ() );
    }
}
