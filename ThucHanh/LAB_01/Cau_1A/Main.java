package LAB_01.Cau_1A;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
 
public class Main {
    public static void main(String[] args){
        
        DanhSachXe danhSachXe = new DanhSachXe();
        
        Menu menu = new Menu(danhSachXe);
        menu.displayMenu();
    }
}
