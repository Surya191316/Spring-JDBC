package org.example;

public class Employee {
    private int id;
    private String name;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
