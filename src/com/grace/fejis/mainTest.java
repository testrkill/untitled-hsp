package com.grace.fejis;

//import com.grace.fe.test1;//此处会报错

import java.lang.System;

public class mainTest {
    public static void main(String[] args) {
        test1 test=new test1();
        com.grace.fejis.test1 test1 = new com.grace.fejis.test1();

        System.out.println("系统包中的lang包自动导入，无需手动写import");
    }
}
