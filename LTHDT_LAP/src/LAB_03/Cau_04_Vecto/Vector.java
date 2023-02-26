/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_04_Vecto;

/**
 *
 * @author TAMTRAN
 */
public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
        x=0;
        y=0;
        z=0;
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(Vector vt) {
        x = vt.x;
        y = vt.y;
        z = vt.z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public Vector add(Vector a){
        x += a.x;
        y += a.y;
        z += a.z;
        return new Vector(x,y,z);
    }
    public Vector sub(Vector a){
        x -= a.x;
        y -= a.y;
        z -= a.z;
        return new Vector(x,y,z);
    }
}
