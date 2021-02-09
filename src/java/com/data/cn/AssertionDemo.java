package com.data.cn;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class AssertionDemo {
    public static void main(String[] args) {
        AssertionDemo ad = new AssertionDemo();
        System.out.println(ad);
    }
}

class AssertionOne{
    AssertionOne(){
        double x = Math.abs(-123);
        assert x >= 330;
        int y = -123;
        assert y >= 0 : "y must >= 0";
        System.out.println(x);
        System.out.println(y);
    }
}
