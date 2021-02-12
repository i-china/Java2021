package com.enums.cn;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class InvocationDemo {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                System.out.println(method);
                if(method.getName().equals("hi")) {
                    System.out.println("good " + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[] {Hello.class},
                handler);
        hello.hi("Hale");
    }
}

interface Hello{
    void hi(String name);
}

class hale implements Hello {
    public void hi(String name){
        System.out.println("hi");
    }
}
