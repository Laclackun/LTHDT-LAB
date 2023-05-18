/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Bai_1;
import java.time.LocalDate;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author TNMT
 */
public class Order {
    public int orderID;
    public LocalDate orderDate;
    public OrderDetail[] lineItems;
    public int count;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new OrderDetail[20];
        this.count = 0;
    }
    
    public void addLineItem(Product product, int quantity) {
        lineItems [count] = new OrderDetail(product, quantity);
        count++;
    }
    
    public double calcTotalCharge(){
        double totalCharge = 0;
        for (int i = 0; i < count ; i++)
            totalCharge = totalCharge + lineItems[i].calcTotalPrice();
        return totalCharge;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###0.000");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        StringBuilder sb = new StringBuilder();
        sb.append("Ma HD: ").append(orderID ).append("\n");
        sb.append("Ngay lap hoa don: ").append(formatter.format(orderDate)).append("\n");
        sb.append(String.format("%-5s | %-10s | %-15s | %15s | %8s | %15s \n"
                ,"STT", "Ma SP", "Mo ta", "Don Gia", "So Luong", "Thanh Tien"));
        
        for (int i = 0; i < count; i++){
            OrderDetail item = lineItems[i];
            sb.append(String.format("%-5s | %-10s | %-15s | %15s | %8s | %15s \n",
                i + 1, item.getProduct().getProductID(),item.getProduct().getDescription(),
                decimalFormat.format(item.getProduct().getPrice()), item.getQuantity(), decimalFormat.format(item.calcTotalPrice()) + " VND"));
        }
        sb.append("Tong tien thanh toan: ").append(decimalFormat.format(calcTotalCharge()) + " VND");
        return sb.toString();
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OrderDetail[] getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
