package com.grace.extend_.extendsTheory;

public class Theory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        //System.out.println(son.age);//父类的私有属性无法直接访问
        System.out.println(son.getAge());
        System.out.println(son.hobby);
        /*
        son.name先从子类中找，如果找不到该字段则往父类中找，如果找不到则继续往父类的父类找。一旦找到就不再继续向上找，直到Object类
         */
    }
}

class Grandpa{
    String name="Grandpa";
    String hobby="hobby";
}
class Father extends Grandpa{
    String name="Father";
    private int age=30;
    public int getAge() {
        return age;
    }

}
class Son extends Father{
    String name="Son";
}
