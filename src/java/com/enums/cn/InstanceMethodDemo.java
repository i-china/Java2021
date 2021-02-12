package com.enums.cn;

import java.lang.reflect.Constructor;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class InstanceMethodDemo {
    public static void main(String[] args) throws Exception {
        InstanceTest it = new InstanceTest();
    }
}

class InstanceTest {
    InstanceTest() throws Exception {
        Constructor c1 = Integer.class.getConstructor(int.class);
        Integer n1 = (Integer)c1.newInstance(123);
        System.out.println(n1);
    }
}
