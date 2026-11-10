package com.grace.extend_.improve;

public class Graduate extends Student{
    public Graduate(){
//        super(name);//在调用父类构造器之前，无法引用Student.name。
        super("smith");
        System.out.println("调用Graduate()");
    }
    public void testing(){
        System.out.println("大学生"+name+"正在考试....");
    }
}
