package org.surya.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cm = new ClassPathXmlApplicationContext("autowiringconfig.xml");
        Employee e = (Employee) cm.getBean("employee");
        System.out.println(e);
    }
}
