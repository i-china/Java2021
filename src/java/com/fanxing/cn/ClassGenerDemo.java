package com.fanxing.cn;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class ClassGenerDemo {
    public static void main(String[] args) {

    }
}

class Ons<T>{
    private T one;
    private T two;
    public Ons(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        one = clazz.newInstance();
    }
}
class cmp<T>{
    public boolean cmp(T t){
        return this == t;
    }
}

class thr{
    thr() {
        Class<Integer> clazz = Integer.class;
        Type t = clazz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments();
            Type firstType = types[0];
            Class<?> typeClass = (Class<?>) firstType;
            System.out.println(typeClass);
        }
    }
}
/*class Aron{
    private T name;
    private T age;
    public Aron(T name, T age){
        this.name = name;
        this.age = age;
    }
    public T getName(){
        return name;
    }
    public T getAge(){
        return age;
    }
}*/
/*
class Ron extends Aron<Integer>{
    public Ron(Integer name, Integer age){
        super(name,age);
    }
}*/
