/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_01;

/**
 *
 * @author TAMTRAN
 */
public class Fraction {
    //Thuoc tinh
    private int numerator;
    private int denominator;
    
    //Phuong thuc
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    
    public void setDenominator (int denominator){
        this.denominator = denominator;
    }
    
    public int getNumerator(){
        return this.numerator;
    }
    
    public int getDenominator(){
        return this.denominator;
    }
    
    public Fraction(){
        this.numerator = 0;
        this.denominator = 1;
    }
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction (Fraction f){
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }
    
    public Fraction add(Fraction f){
        int tu = (numerator * f.denominator) + (f.numerator * denominator);
        int mau = denominator * f.denominator;
        return new Fraction(tu,mau);
    }
    
    public Fraction sub(Fraction f){
        int tu = (numerator * f.denominator) - (f.numerator * denominator);
        int mau = denominator * f.denominator;
        return new Fraction(tu,mau);
    }
    
    public Fraction mul(Fraction f){
        int tu = numerator * f.numerator;
        int mau = denominator * f.denominator;
        return new Fraction(tu,mau);
    }
    
    public Fraction div(Fraction f){
        int tu = numerator * f.denominator;
        int mau = denominator * f.numerator;
        return new Fraction(tu,mau);
    }
    
    public void reducer(){
        int a = numerator;
        int b = denominator;
        int ucln = a%b;
        while (ucln != 0){
            a = b;
            b = ucln;
            ucln = a % b;
        }
        
        numerator /= b;
        denominator /= b;
    }
    
    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
