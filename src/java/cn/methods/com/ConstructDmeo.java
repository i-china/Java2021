package cn.methods.com;

import java.lang.reflect.Constructor;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class ConstructDmeo {
    public static void main(String[] args) throws Exception {
        Constructor ct = Integer.class.getConstructor(int.class);
        Integer n1 = (Integer) ct.newInstance(123);
        System.out.println(n1);
    }
}

class Person6{
    public Person6(){

    }
}
