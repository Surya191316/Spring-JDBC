package org.example.map;

import java.util.Map;

public class Customer {
    private int id;
    private Map<Integer, String> products;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }

    public Customer(int id, Map<Integer, String> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }
}
