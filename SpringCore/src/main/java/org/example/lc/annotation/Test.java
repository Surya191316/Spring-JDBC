package org.example.lc.annotation;

import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lcannotationconfig.xml");
        Patient p= (Patient) ctx.getBean("patient");

        System.out.println(p);
        ctx.registerShutdownHook();

    }
}


