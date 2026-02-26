package org.example.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lcconfig.xml");
        Patient p= (Patient) ctx.getBean("patient");

        System.out.println(p);
        ctx.registerShutdownHook(); //to invoke destroy method we need AbstractApplicationContext
    }
}

//  In Java, System.out.println(someObject) will call the object’s toString() method.
// Without your own toString(): it uses the default implementation from java.lang.Object, which prints:
//  <className>@<hashCodeInHex>
//  So org.example.lc.Patient@43301423 means:
// org.example.lc.Patient → the runtime class name.
// 43301423 → the object’s hash code in hexadecimal
//
// With your own toString(): your overridden method’s return value is used. That’s why you get:
// Patient{id=123}
