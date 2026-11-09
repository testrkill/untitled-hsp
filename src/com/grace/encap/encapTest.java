package com.grace.encap;

class user{
    public int age;
    private int salary;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void info(){
        System.out.println("age:"+age+" salary:"+salary+" name:"+name);
    }
}
/*
业务逻辑：age必须在1-90之间，name字符长度在2-6之间，salary不能被随便查看
 */
public class encapTest {
    public static void main(String[] args) {
        user u = new user();
        u.setAge(100);
        u.setSalary(30000);
        u.setName("lisa");
        u.info();
    }
}
