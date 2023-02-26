/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class Triangle {
    //Thuoc tinh
    private float width;    
    private float height;
    
    //Phuong thuc
    public Triangle(){
        this.width = 0;
        this.height = 0;
    }
    
    public Triangle(float width, float height){
        this.width = width;
        this.height = height;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public float getHeight(){
        return this.height;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
    
    public void setHeight(float height){
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "(" + this.width + "; " + this.height + ")";
    }
}
