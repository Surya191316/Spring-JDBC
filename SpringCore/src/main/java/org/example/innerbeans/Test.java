package org.example.innerbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("innerbeanconfig.xml");
        Employee emp= (Employee) ctx.getBean("employee");
        System.out.println(emp.hashCode());
        Employee emp2= (Employee) ctx.getBean("employee");
        System.out.println(emp2.hashCode());
    }
}

