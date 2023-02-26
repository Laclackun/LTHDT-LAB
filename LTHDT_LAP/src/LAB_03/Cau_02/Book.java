/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_02;

/**
 *
 * @author TAMTRAN
 */
public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
    
    public Book(){
        this.boCode = null;
        this.boTitle = null;
        this.boAuthor = null;
    }
    
    public Book(String boCode, String boTitle, String boAuthor){
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    
    public Book (Book bo){
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }
    
    public String getBoCode(){
        return this.boCode;
    }
    
    public String getBoTitte(){
        return this.boTitle;
    }
    
    public String getBoAuthor(){
        return this.boAuthor;
    }
    
    public void setBoCode(String code){
        this.boCode = code;
    }
    
    public void setBoTilte(String title){
        this.boTitle = title;
    }
    
    public void setBoAuthor (String authorname){
        this.boAuthor = authorname;
    }
    
    @Override
    public String toString(){
        return "Code: " + this.boCode + ", Title: " + this.boTitle + ", Author: "+ this.boAuthor;
    }
}
