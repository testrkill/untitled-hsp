package com.grace.override;

public class Dog extends Animal{
    public String name;
    public String m1(){
        return "调用子类m1";
    }
    public void cry(){
        System.out.println("汪汪叫");
    }
    protected void eat(){}

}
