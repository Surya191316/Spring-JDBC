package org.example.map;

import org.example.set.CarDealer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mapconfig.xml");
        Customer cus = (Customer) context.getBean("customer");
        //here the name of the bean should map with name in configuration file
        System.out.println(cus);
    }
}
