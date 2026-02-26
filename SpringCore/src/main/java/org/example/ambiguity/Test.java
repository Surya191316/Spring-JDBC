package org.example.ambiguity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ambiguityconfig.xml");
        Addition a = (Addition) ctx.getBean("addition");
        System.out.println(a);
    }
}

