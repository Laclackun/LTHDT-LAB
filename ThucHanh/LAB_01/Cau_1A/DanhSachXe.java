/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_01.Cau_1A;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
public class DanhSachXe {
    
    ArrayList<Xe> xe = new ArrayList();
    
    public DanhSachXe(){
        xe = new ArrayList();
    }
    
    public void xuatXe(Xe a) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Số Lượng Cần Thêm.");
        for(int i = 0; i < n; i++){
            System.out.print("Lần nhập thử"+ (i+1) +":");
            if (a instanceof Xe){
                a = new Xe();
                a.nhapXe();
            }
        }
            
    }

    public List<Xe> getAllXe() {
        return new ArrayList<>(danhSachXe);
    }
    
}
