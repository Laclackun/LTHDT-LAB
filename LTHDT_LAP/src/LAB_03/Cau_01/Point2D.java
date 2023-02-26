/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class Point2D {
    //Thuoc tinh
    private float x;
    private float y;
    
    //Phuong thuc
    public Point2D(){
        this.x=0;
        this.y=0;
    }
    
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    
    public float getX(){
        return this.x;
    }
    
    public float getY(){
        return this.y;
    }
}

