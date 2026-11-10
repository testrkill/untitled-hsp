package com.grace.extend_.improve;

public class Pupil extends Student{
    public Pupil(){
        super();//默认调用父类构造器，不写编译器都会自动加
        System.out.println("Pupil()");
    }
    public void testing(){
        System.out.println("小学生"+name+"正在考试....");
    }
}
