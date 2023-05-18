/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Bai_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        int choice;
        do {
            System.out.println(" Bang Menu SV ");
            System.out.println("1. In Danh Sach");
            System.out.println("2. Them Sinh Vien");
            System.out.println("3. Xoa Sinh Vien");
            System.out.println("4. Sua Thong Tin");
            System.out.println("5. Tim Kiem Theo Ma");
            System.out.println("6. Tim Kiem Theo Ten");
            System.out.println("7. Sap Xep Theo Ma Tang Dan");
            System.out.println("0. Thoat");
            System.out.print("Xin Hay Nhap Lua Chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    editStudent();
                    break;
                case 5:
                    searchById();
                    break;
                case 6:
                    searchByName();
                    break;
                case 7:
                    sortByIdAscending();
                    break;
                case 0:
                    System.out.println("Tam Biet.");
                    break;
                default:
                    System.out.println("Khong Hop Le, Xin Hay Thu Lai!");
            }
            System.out.println();
        } while (choice != 0);
    }

    private void displayStudents() {
        System.out.println("___ Danh Sach Sinh Vien ___");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void addStudent() {
        System.out.println("___ Them Sinh Vien ___");
        System.out.print("Nhap ma sinh vien: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ho va ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Ma sinh vien khong ton tai!");
                return;
            }
        }

        Student newStudent = new Student(id, name, birthYear);
        students.add(newStudent);
        System.out.println("Them sinh vien thanh cong!");
    }

    private void removeStudent() {
        System.out.println("___ Xoa Sinh Vien ___");
        System.out.print("Nhap ma sinh vien can xoa: ");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Xoa sinh vien thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay sinh vien co ma " + id);
    }

    private void editStudent() {
        System.out.println("___ Sua Thong Tin Sinh Vien ___");
        System.out.print("Nhap ma sinh vien can sua: ");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Nhap ho va ten moi: ");
                String name = scanner.nextLine();
                System.out.print("Nhap nam sinh moi: ");
                int birthYear = scanner.nextInt();
                scanner.nextLine();

                student.setName(name);
                student.setBirthYear(birthYear);
                System.out.println("Sua thong tin thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay sinh vien co ma " + id);
    }

    private void searchById() {
        System.out.println("___ Tim Kiem Theo Ma ___");
        System.out.print("Nhap ma sinh vien can tim: ");
        String id = scanner.nextLine();

        // Tìm sinh viên theo mã
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }

        System.out.println("Khong tim thay sinh vien co ma " + id);
    }

    private void searchByName() {
        System.out.println("___ Tim Kiem Theo Ten ___");
        System.out.print("Nhap ma sinh vien can tim: ");
        String name = scanner.nextLine();

        // Tìm sinh viên theo tên
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien co ten " + name);
        }
    }

    private void sortByIdAscending() {
        System.out.println("___ Sap Xep Theo Ma Tang Dan ___");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getId().compareTo(s2.getId());
            }
        });
        displayStudents();
    }
}
