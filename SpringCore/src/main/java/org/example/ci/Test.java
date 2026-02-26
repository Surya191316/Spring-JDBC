package org.example.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ciconfig.xml");
        Employee emp = (Employee) ctx.getBean("employee");

        System.out.println(emp);
//        System.out.println("Employee Name: " + emp.getName());
    }
}