package org.surya.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cm = new ClassPathXmlApplicationContext("annotationconfig.xml");
        Employee e = (Employee) cm.getBean("employee");
        System.out.println(e);
    }
}
