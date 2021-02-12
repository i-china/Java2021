package com.fanxing.cn;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class GenericDemo<T,K> {
    private T name;
    private K age;
    public GenericDemo(T name, K age){
        this.name = name;
        this.age = age;
    }
    public T getName(){
        return name;
    }
    public K getAge(){
        return age;
    }
    public static void main(String[] args) {
        GenericDemo<String,Integer> gn = new GenericDemo<>("Hale",23);
        System.out.println(gn);
    }
}



