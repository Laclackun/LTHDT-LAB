/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_04.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class Circle {
    private Double radius;
    private String color;
    public Circle (Double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public Double getRadius (){
        return radius;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }
    public String getColor (){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
 
    @Override
    public String toString(){
        return "Circle : r = " + radius + ", color = " + color;
    }
    
    public class Cylinder extends Circle{
        private Double height;
        public Cylinder(Double radius, String color, Double height) {
            super(radius, color);
            this.height = height;
        }
        
        public Double getHeight (){
        return height;
        }
        public void setHeight (double height){
        this.height = height;
        }
        
        public double getVolume(){
        return getArea() * height;
        }
    }
}
