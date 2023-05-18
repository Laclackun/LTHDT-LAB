/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_03.Bai_3;

/**
 *
 * @author TNMT
 */

class Student {
    private String id;
    private String name;
    private int birthYear;

    public Student(String id, String name, int birthYear) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-6s | %-15s | %10s |\n"
                ,"Ma SV", "Ho va Ten", "Nam Sinh"));
        sb.append(String.format("%-6s | %-15s | %10s |\n", id, name,birthYear));
        return sb.toString();
    }
}



