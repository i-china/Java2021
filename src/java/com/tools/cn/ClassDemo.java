package com.tools.cn;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        OneThre ot = new OneThre();
    }
}
class OneThre{
    OneThre(){
//        Integer n = new Integer(123);
//        boolean b1 = n instanceof Integer;
//        boolean b2 = n instanceof Number;
//        boolean b3 = n.getClass() == Integer.class;
//        boolean b4 = n.getClass() == Number.class;
//        System.out.println(b3 + "  " + b4);
    }
}

class OneTime{
    /*OneTime(){
        Class one = String.class;
        String s = "Hellod;";
        Class two = s.getClass();

        boolean result = one == two;
    }*/
    void OneTime(Object obj){
        Class cls = obj.getClass();
    }
}

class OneA{
    OneA() throws ClassNotFoundException {
        Class one = String.class;
        String s = "hi";
        Class two = s.getClass();
        Class three = Class.forName("java.lang.String");
    }
}