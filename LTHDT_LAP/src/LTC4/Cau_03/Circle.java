/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LTC4.Cau_03;

/**
 *
 * @author TAMTRAN
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return radius*radius*3.14;
    }
    
    public double getPerimeter() {
        return radius*3.14*2;
    }

    @Override
    public String toString() {
        return "Hinh Tron co P = " + getPerimeter() + "Va co S = " + getPerimeter();
    }
    
}
