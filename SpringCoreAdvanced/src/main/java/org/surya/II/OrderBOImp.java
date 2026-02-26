package org.surya.II;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImp implements OrderBO{

    @Autowired
    private OrderDAO dao;

    @Override
    public void placeOrder() {
        System.out.println("I'm inside Order BO");
        dao.createOrder();
    }

//    public OrderBOImp() {
//    }
//
//    public OrderBOImp(OrderDAO dao) {
//        this.dao = dao;
//    }

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }
}
