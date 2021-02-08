package com.data.cn;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/

//    byte char int short float double long boolean
//    byte character integer short float double long boolean   wrapper class
//    class interface
public class BaoZhuangType {
    public static void main(String[] args) {
        Base b = null;
        Integer n = null;
        Integer n2 = new Integer(30);
        int n3 = n2.intValue();
    }
}

class Base{
    Base(){
//        int a = null;
        String s = null;

    }
}

/*

class Integer{
    private int value;

    Integer(int value){
        this.value = value;
    }
    public int intValue(){
        return this.value;
    }
}*/
