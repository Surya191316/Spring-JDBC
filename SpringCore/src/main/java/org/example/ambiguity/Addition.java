package org.example.ambiguity;

public class Addition {
    Addition(int a, double b){
        System.out.println("I am in constructor");
        System.out.println("I am int value of: "+a);
        System.out.println("I am double value of: "+b);
    }

    Addition(double a, double b){
        System.out.println("I am in DOUBLE");
    }

    Addition(int a, int b){
        System.out.println("I am in INT");
    }

    Addition(String a, String b){
        System.out.println("I am in STRING");
    }
}
