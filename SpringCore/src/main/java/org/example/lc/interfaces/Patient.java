package org.example.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
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

    public void hi(){
        System.out.println("I am init method");
    }
    public void bye(){
        System.out.println("I am destroy method");
    } // we need a shutdown hook to invoke the destroy method

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties are set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am inside destroy");
    }
}
