package org.surya.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.surya.Standalone.ProductList;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cm = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Instructor instructor = (Instructor) cm.getBean("instructor");
        System.out.println(instructor);

        Instructor instructor2 = (Instructor) cm.getBean("instructor");
        System.out.println(instructor2);  //default
    }
}