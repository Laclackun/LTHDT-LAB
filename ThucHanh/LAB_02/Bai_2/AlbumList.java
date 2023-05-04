/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02.Bai_2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
public class AlbumList {
    private CD[] cds;
    private int size;
    private int capacity;

    public AlbumList(int capacity) {
        this.cds = new CD[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean addCD(CD cd) {
        if (cd == null || size >= capacity || containsCD(cd)) {
            return false;
        }
        cds[size++] = cd;
        return true;
    }
}
