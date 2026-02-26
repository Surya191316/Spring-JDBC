package org.example.set;

import org.example.list.Hospital;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer cd = (CarDealer) context.getBean("CarDealer");
        System.out.println(cd.getName());
        System.out.println(cd.getModels());
        System.out.println(cd.getModels().getClass());
        //getClass() will tell what type of list is this linked or array we got array which is default
    }
}