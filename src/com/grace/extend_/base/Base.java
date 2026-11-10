package com.grace.extend_.base;

public class Base {
    String name;
    public Base(String name) {
        System.out.println("调用Base(String name)方法,子类对象给父类字段name赋值为"+name);
    }
}
