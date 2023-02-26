/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Cau_02;

/**
 *
 * @author TAMTRAN
 */
public class Student {
    private String stID;
    private String stName;
    private String stClass;
    
    public Student(){
        this.stID = null;
        this.stName = null;
        this.stClass = null;
    }
    
    public Student(String stID, String stName, String stClass){
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    
    public Student (Student st){
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }
    
    public String getStID(){
        return this.stID;
    }
    
    public String getStName(){
        return this.stName;
    }
    
    public String getStClass(){
        return this.stClass;
    }
    
    public void setStID(String id){
        this.stID = id;
    }
    
    public void setStName(String name){
        this.stName = name;
    }
    
    public void setStClass(String stClass){
        this.stClass = stClass;
    }
    
    @Override
    public String toString(){
        return "ID: " + this.stID + ", Name" + this.stName + ", Class" +this.stClass;
    }
}
