package com.fanxing.cn;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class PairDemoTwo {
    public static void main(String[] args) {


    }
}

class PairTest<T> {
    private T one;
    private T two;
    public PairTest(T one, T two){
        this.one = one;
        this.two = two;
    }
    public T getOne(){
        return one;
    }
    public T getTwo(){
        return two;
    }
    public PairTest<T> create(T one, T two){
        return new PairTest<T>(one,two);
    }
}

// Beautiful
class MoreGeneric<T,K>{
    private T name;
    private K age;
    public MoreGeneric(T name, K age){
        this.name = name;
        this.age = age;
    }
    public T getName(){
        return name;
    }
    public K getAge(){
        return age;
    }
}
