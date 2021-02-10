package com.data.cn;

import java.lang.reflect.Field;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class classValueDemo {
    public static void main(String[] args) throws Exception{
        Person2 p2 = new Person2("Hale");
        Class st = Person2.class;
        Class a = p2.getClass();
//        System.out.println(a.getField("name"));
        Field f = a.getDeclaredField("name");
        f.setAccessible(true);
        Object o = f.get(p2);
        System.out.println(o);
        System.out.println(st.getField("age"));
    }
}

class Person2{
    public int age;
    private String name;
    public Person2(String name){
        this.name = name;
    }
}
