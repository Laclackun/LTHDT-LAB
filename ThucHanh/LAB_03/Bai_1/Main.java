/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Bai_1;
import java.time.LocalDate;

/**
 *
 * @author TNMT
 */
public class Main {
    public static void main (String[] args){
        Product p1 = new Product("Nuoc Tuong", "sp4", 8);
        Product p2 = new Product("Gao", "sp1", 18);
        Product p3 = new Product("Duong", "sp3", 10);
        Product p4 = new Product("Gao", "sp1", 18);
        
        Order order = new Order (1, LocalDate.now());
        order.addLineItem(p1, 10);
        order.addLineItem(p2, 5);
        order.addLineItem(p3, 1);
        order.addLineItem(p4, 1);
        
        System.out.println(order.toString());
    }
    
}
