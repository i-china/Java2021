package com.fanxing.cn;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class PairDemo {
    public static void main(String[] args) {

    }
}


class Pair {
    private String one;
    private String two;
    public Pair(String one, String two){
        this.one = one;
        this.two = two;
    }
    public String getOne(){
        return one;
    }
    public String getTwo(){
        return two;
    }
}