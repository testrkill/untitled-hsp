package com.grace.override;

public class OverRide1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.cry();//子类有cry方法则调用子类的，如果没有则往父类找
    }
}
