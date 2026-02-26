package org.surya.II;


import org.springframework.stereotype.Component;

@Component
public class OrderDAOImp implements OrderDAO{
    @Override
    public void createOrder() {
        System.out.println("I am inside Order DAO");
    }
}
