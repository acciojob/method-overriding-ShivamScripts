package com.driver;

public class Main {
    public static void main(String[] args){
        B obj = new B();

        // Calling the method from class A
        String result1 = obj.meth();
        System.out.println(result1);

        // Calling the overridden method from class B
        String result2 = obj.meth();
        System.out.println(result2);
    }
}