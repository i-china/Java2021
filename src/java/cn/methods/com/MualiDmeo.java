package cn.methods.com;

import java.lang.reflect.Method;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class MualiDmeo {
    public static void main(String[] args) throws Exception{
        Method m = Duotai.class.getMethod("hello");
        m.invoke(new ZiLei());
    }
}

class Duotai{
    public void hello(){
        System.out.println("DuoTai:hello");
    }
}

class ZiLei extends Duotai{
    public void hello(){
        System.out.println("Zilei:hello");
    }
}
