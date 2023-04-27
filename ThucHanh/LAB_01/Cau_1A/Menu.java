/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_01.Cau_1A;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
public class Menu {

    private DanhSachXe danhSachXe;
    private Scanner scanner;

    public Menu(DanhSachXe danhSachXe, Scanner scanner) {
        this.danhSachXe = danhSachXe;
        this.scanner = scanner;
    }
    
        public Menu(java.util.Scanner scanner) {
        danhSachXe = new DanhSachXe();
        this.scanner = scanner;
    }
    
    public void displayMenu() {
        int choice = 0;
        do {
            System.out.println("1. Nhập Thông Tin Xe");
            System.out.println("2. Xuất Bản Kê Khai Thuế");
            System.out.println("3. Thoát");
            System.out.println("Mời Nhập Lựa Chọn:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 ->
                    themXe();
                case 2 ->
                    xuatThongTin();
                case 3 ->
                    System.out.println("Goodbye!");
                default ->
                    System.out.println("Lựa Chọn Không Hợp Lệ Mới Chọn Lại.");
            }

        } while (choice != 3);
        
    }

    
    private void themXe(){
        System.out.print("Nhập Tên Chủ Xe: ");
        String tenChuXe = scanner.nextLine();
        System.out.print("Nhập Loại Xe: ");
        String loaiXe = scanner.nextLine();
        System.out.print("Nhập Dung Tích Xe: ");
        int dungTich = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập Trị Giá Xe: ");
        float triGia = scanner.nextFloat();
        scanner.nextLine();
        
        Xe xe = new Xe(tenChuXe, loaiXe, dungTich, triGia);
        danhSachXe.themXe(xe);
        System.out.println("Thêm Xe Thành Công");

    }
    
    private void xuatThongTin() {
       System.out.printf("Tên Chủ Xe      "  + "Loại Xe      " + "Dung Tích      " + "Trị Giá      " + "Thuế Phải Nộp");
       System.out.printf("=========================================================================================");
       Xe xe = new Xe();
       xe.inThongTinXe();
    }
}
    
