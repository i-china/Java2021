package com.java.cn;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class thisDemo {
    public static void main(String[] args){
        Adder adder = new Adder();
        adder.add(3)
                .add(3)
                .inc()
                .add(3);
        System.out.println(adder.value());
    }
}

class Adder {
    private int sum = 0;
    public Adder add(int n){
        sum += n;
        return this;
    }
    public Adder inc(){
        sum++;
        return this;
    }
    public int value(){
        return sum;
    }
}
