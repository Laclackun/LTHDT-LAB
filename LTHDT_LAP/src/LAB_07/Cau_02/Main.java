/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_07.Cau_02;

/**
 *
 * @author TAMTRAN
 */

public class Main {
    
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(5, 6, 10, 10);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
           
        Movable m2 = new MovableCircle(2, 1, 2, 2, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
