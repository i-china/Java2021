package cn.methods.com;

import java.lang.reflect.Method;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class getMethodDmeo {
    public static void main(String[] args) throws Exception {
        Person5 p5 = new Person5();
    }
}


class Person5{
    Person5() throws Exception {
        String s = "helllo world";
        Method m = String.class.getMethod("substring",int.class);
        String r = (String) m.invoke(s,3);
        System.out.println(r);
    }
}
