/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Bai_1;

/**
 *
 * @author TNMT
 */
public class OrderDetail {
    public int quantity;
    public Product product;

    
    public double calcTotalPrice(){
        return quantity*product.getPrice();
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quantity=" + quantity + ", product=" + product + '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public OrderDetail(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }
}
