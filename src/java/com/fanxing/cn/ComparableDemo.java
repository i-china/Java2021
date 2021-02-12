package com.fanxing.cn;

import java.util.Arrays;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class ComparableDemo {
    public static void main(String[] args) {
        Person[] ps = new Person[] {
                new Person("One",11),
                new Person("two",22),
                new Person("three",33)
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}


class Person{
    String name;
    int score;
    Person(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return this.name + ", " + this.score;
    }
}