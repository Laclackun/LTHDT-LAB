/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Bai_1;

/**
 *
 * @author TNMT
 */
public class Product {
    public String description;
    public String productID;
    public double price;

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", productID=" + productID + ", price=" + price + '}';
    }

    public Product() {
        this.description = null;
        this.productID = null;
        this.price = 0;
    }

    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
