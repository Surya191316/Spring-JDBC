package org.example.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hs = (Hospital) context.getBean("hospital");
        System.out.println(hs.getName());
        System.out.println(hs.getDepartments());
        System.out.println(hs.getDepartments().getClass());
        //getClass() will tell what type of list is this linked or array we got array which is default
    }
}
// we are doing a cast because the ApplicationContext#getBean(String name) method
// returns Object. Spring doesn’t know at compile time what type you expect when
// you ask by name only, so it gives you a generic Object. To use it as a Hospital,
// you must cast.
//
// Since the compile-time type is Object, Java requires an explicit cast to the target
// type (Hospital) so that you can call Hospital-specific methods and accessors.
// If the bean isn’t actually a Hospital, this cast will fail at runtime with a
// ClassCastException. That’s why Spring provides type-safe overloads to avoid this.

// Works when there is exactly one Hospital bean in the context.
// If there are multiple Hospital beans, Spring will throw NoUniqueBeanDefinitionException
// (in that case, prefer option 1 with the bean name).

//If there is only 1 element in the list then <value> tag is optional
//We can also create an empty list with no values in it with by removing all the values.

