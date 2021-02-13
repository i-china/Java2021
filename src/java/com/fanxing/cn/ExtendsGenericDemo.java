package com.fanxing.cn;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class ExtendsGenericDemo {
    public static void main(String[] args) {
        Pai<Integer> p = new Pai<>(123,234);
        int n = add(p);
        System.out.println(n);
    }
    static int add(Pai<? extends Number> p){
        Number name = p.getName();
        Number age = p.getAge();
        return name.intValue() + age.intValue();
    }
}

class Pai<T>{
    private T name;
    private T age;
    public Pai(T name, T age){
        this.name = name;
        this.age = age;
    }
    public T getName(){
        return name;
    }
    public T getAge(){
        return age;
    }
}
