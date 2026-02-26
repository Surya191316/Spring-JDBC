package org.example.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("depenconfig.xml");
        Prescription pre= (Prescription) ctx.getBean("prescription");

        System.out.println(pre);

    }
}
