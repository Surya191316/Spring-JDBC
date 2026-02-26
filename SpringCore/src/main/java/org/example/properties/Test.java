package org.example.properties;

import org.example.map.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesconfig.xml");
        CountryAndLang cl = (CountryAndLang) context.getBean("candl");
        System.out.println(cl);
    }
}
