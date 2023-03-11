/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC4.Cau_03;

/**
 *
 * @author TAMTRAN
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length*width;
    }
    
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Hinh Chu Nhat co P = " + getPerimeter() + "Va co S = " + getPerimeter();
    }
    
    
}
