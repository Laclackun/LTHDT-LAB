/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC4.Cau_03;

/**
 *
 * @author TAMTRAN
 */
public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double length, double width) {
        super(length, width);
        this.side = side;
    }

    public Square(double side, double length, double width, String color, boolean filled) {
        super(length, width, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public void setLength(double length) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.side = side;
    }
    
    @Override
    public String toString() {
        return "Hinh Vuong co P = " + getPerimeter() + "Va co S = " + getPerimeter();
    }
}
