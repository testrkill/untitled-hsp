package com.grace.fejis;

import com.grace.fejis.Test1;
//import com.grace.fe.test1;//此处会报错

import java.lang.System;

public class MainTest {
    public static void main(String[] args) {
        Test1 test=new Test1();
        com.grace.fe.Test1 test1 = new com.grace.fe.Test1();

        System.out.println("系统包中的lang包自动导入，无需手动写import");

        System.out.println(" n1= "+test.n1+ " n2= "+test.n2+" n3= "+test.n3);
        Test1Extend.say();
    }
}
