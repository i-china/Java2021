package com.data.cn;


import java.lang.reflect.Field;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/

public class FieldSetDemo{
    public static void main(String[] args) throws Exception {
        Person3 p3 = new Person3("hale");
        System.out.println(p3.getName());
        Class c = p3.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p3,"Hadoop ");
        System.out.println(p3.getName());

    }
}

class Person3{
    private String name;
    public Person3(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

