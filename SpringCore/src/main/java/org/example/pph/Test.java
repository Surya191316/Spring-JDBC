package org.example.pph;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mydaoconfig.xml");
        MyDAO dao= (MyDAO) ctx.getBean("myDAO");
        System.out.println(dao);
    }
}

