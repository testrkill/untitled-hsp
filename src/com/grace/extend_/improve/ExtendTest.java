package com.grace.extend_.improve;


public class ExtendTest {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="jack1";
        pupil.age=12;
        pupil.testing();
        pupil.setScore(60);
        pupil.info();

        Graduate graduate = new Graduate();
        graduate.name="smith1";
        graduate.age=21;
        graduate.testing();
        graduate.setScore(80);
        graduate.info();
    }
}
