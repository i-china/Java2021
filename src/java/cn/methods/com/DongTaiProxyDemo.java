package cn.methods.com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class DongTaiProxyDemo {
    public static void main(String[] args) throws Throwable {
//        DynamicDemo dd = new DynamicDemo();
//        dd.morning("hale");

        InvocationHandler handler = new InvocationHandler(){
              @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                  System.out.println(method);
                  if(method.getName().equals("morning")){
                      System.out.println("good morning" + args[0]);
                  }
                  return null;
              }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[] {Hello.class},
                handler);
                hello.morning("Hale");
    }
}


class DynamicDemo implements DynamicOne{
    public void morning(String name){
        System.out.println(name);
    }
}

interface DynamicOne{
    void morning(String name);
}

interface Hello{
    void morning(String name) throws Throwable;
}

class DynamicProxy implements Hello{
    InvocationHandler handler;
    public DynamicProxy(InvocationHandler handler){
        this.handler = handler;
    }
    public void morning(String name) throws Throwable {
        handler.invoke(
                this,
                Hello.class.getMethod("morning",String.class),
                new Object[] { name }
        );
    }
}
