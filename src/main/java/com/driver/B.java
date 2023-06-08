package com.driver;

public class B extends A{
    public String callSuper(){
        return super.meth();
    }
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
