package com.driver;

public class Main {
    public static void main(String[] args){
        B obj = new B();
        String res1 = obj.callSuper();
        System.out.println(res1);
        String res2 = obj.meth();
        System.out.println(res2);
    }
}