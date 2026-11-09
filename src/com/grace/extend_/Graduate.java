package com.grace.extend_;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("正在考试....");
    }

    public void info(){
        System.out.println(" name : " + name + " age : " + age + " score : " + score);
    }
}
