package com.fanxing.cn;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class SuperGenericDemo {
    public static void main(String[] args) {
        Six<Number> s1 = new Six<>(12);
        setSame(s1,23);
        System.out.println(s1.getFirst());
    }
    static void setSame(Six<? super Integer> p, Integer n){
        p.setFirst(n);
    }
}

class Six<T>{
    private T first;
    Six(T first){
        this.first = first;
    }
    public T getFirst(){
        return first;
    }
    public void setFirst(T first){
        this.first = first;
    }
    /*public void setFirst(? super Integer){

    }*/
}
