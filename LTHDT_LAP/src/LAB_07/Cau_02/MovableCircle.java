/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        System.out.println ("Xe Di Len Phia Truoc");
    }

    public void moveDown() {
        System.out.println ("Xe Di Lui Phia Sau");
    }

    public void moveLeft() {
        System.out.println ("Xe Di Sang Trai");
    }

    public void moveRight() {
        System.out.println ("Xe Di Sang Phai");
    }
    
    public String toString() {
        return "MovableCircle tai dia diem " + center.toString() + " voi ban kinh la: " + radius;
    }
}
    
