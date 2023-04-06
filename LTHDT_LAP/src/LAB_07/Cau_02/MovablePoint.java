/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_07.Cau_02;

/**
 *
 * @author TAMTRAN
 */

public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println ("Xe Di Len Phia Truoc");
    }

    @Override
    public void moveDown() {
        System.out.println ("Xe Di Lui Phia Sau");
    }

    @Override
    public void moveLeft() {
        System.out.println ("Xe Di Sang Trai");
    }

    @Override
    public void moveRight() {
        System.out.println ("Xe Di Sang Phai");
    }

    @Override    
    public String toString() {
        return "MovablePoint co X = " + x + " Y = " + y + " X co toc do la: " + xSpeed + " Y co toc do la: " + ySpeed;
    }
}
