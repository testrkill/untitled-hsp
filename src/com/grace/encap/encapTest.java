package com.grace.encap;

class user{
    public int age;
    private int salary;
    public String name;

    public user(int age, int salary, String name) {
//        this.age = age;
//        this.salary = salary;
//        this.name = name;
        setAge(age);
        setSalary(salary);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1 && age<=90){
            this.age = age;
        }else{
            System.out.println("输入的年龄不合法，给默认年龄1");
            this.age = 1;
        }
    }

    public int getSalary() {
        //此处增加权限，谁可以查看薪水
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6){
            this.name = name;
        }else {
            System.out.println("名字字符长度在2-6之间");
            this.name = null;
        }
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

//        user u = new user();
//        u.setAge(100);
//        u.setSalary(30000);
//        u.setName("lisa");
        user u= new user(100,3000, "lisa");
        u.info();
    }
}
