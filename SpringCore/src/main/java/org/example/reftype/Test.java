package org.example.reftype;

import org.example.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("reftypeconfig.xml");
        Student s= (Student) ctx.getBean("student");

        System.out.println(s);
    }
}
