package com.data.cn;

import com.sun.media.sound.SoftTuning;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class AccessDemo {
    public static void main(String[] args) throws Exception {
        Class one = Student1.class;
        System.out.println(one.getField("name"));
//        System.out.println(one.getField("grade"));
        System.out.println(one.getDeclaredField("score"));
        System.out.println(one.getField("age"));
    }
}

class Person1{
    public int age;
    private int grade;
}

class Student1 extends Person1{
    public String name;
    private int score;
}