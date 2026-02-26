package org.surya.II;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.surya.Standalone.ProductList;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cm = new ClassPathXmlApplicationContext("iiconfig.xml");
        OrderBO bo = (OrderBO) cm.getBean("bo");
        bo.placeOrder();
    }
}
