package com.grace.extend_.improve;

public class Student {

    public Student(){
        System.out.println("调用Student()");
    }
    public Student(String name){
        System.out.println("调用Student(String name)");
    }
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void info(){
        System.out.println(" name : " + name + " age : " + age + " score : " + score);
    }
}
