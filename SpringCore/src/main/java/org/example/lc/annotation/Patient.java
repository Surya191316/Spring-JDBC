package org.example.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId() {
        System.out.println("I am Getter method");
        return id;
    }

    public void setId(int id) {
        System.out.println("I am setter method");
        this.id = id;
    }

    public Patient() {
    }

    public Patient(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
    @PostConstruct
    public void hi(){
        System.out.println("I am init method");
    }
    @PreDestroy
    public void bye(){
        System.out.println("I am destroy method");
    } // we need a shutdown hook to invoke the destroy method
}
