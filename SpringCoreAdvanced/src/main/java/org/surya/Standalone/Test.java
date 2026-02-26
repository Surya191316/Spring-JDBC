package org.surya.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.surya.Annotations.Employee;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cm = new ClassPathXmlApplicationContext("standaoneconfig.xml");
        ProductList PL = (ProductList) cm.getBean("productList");
        System.out.println(PL);
    }
}
