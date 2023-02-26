/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class End {
    public static void main(String[] args) {
        Fraction a = new Fraction (4,8);
        Fraction b = new Fraction (15,3);
        Fraction tong;
        
        tong = a.add(b);
        System.out.println(tong.toString());
        
        Point2D P = new Point2D(2,5);
        System.out.println(P.getX());
        System.out.println(P.getY());
        
        Triangle T = new Triangle(4,5);
        System.out.println(T.toString());
    }
}
