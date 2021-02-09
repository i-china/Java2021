package com.tools.cn;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class MathDemo {
    public static void main(String[] args) {
        One a = new One();

    }
}



class One {
    One(){
        int a = Math.abs(123);
        int b = Math.abs(-123);
        int c = (int) Math.pow(2,10);
        double pi = Math.PI;
        double e = Math.E;
        int s = (int) Math.sin(Math.PI/6);
        double r = Math.random() * 10 ;
        System.out.println(r);
        System.out.println(s);
        System.out.println(e);
        System.out.println(pi);
        System.out.println(c);
        System.out.println(a + b);

    }
}