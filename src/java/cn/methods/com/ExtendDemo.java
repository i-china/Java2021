package cn.methods.com;

import java.io.Serializable;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class ExtendDemo {
    public static void main(String[] args) {
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);

        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());

        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for(Class ii : is){
            System.out.println(ii);
        }

        Class ss = Integer.class.getSuperclass();
        Class[] cs = ss.getInterfaces();
        for(Class ci : cs){
            System.out.println(ci);
        }

        System.out.println(java.io.DataInputStream.class.getSuperclass());
        System.out.println(java.io.Closeable.class.getSuperclass());

        Object ob = Integer.valueOf(123);
        boolean isDouble = ob instanceof Double;
        boolean isIntger = ob instanceof Integer;
        boolean isNumber = ob instanceof Number;
        boolean isSerializable = ob instanceof Serializable;
        System.out.println(isSerializable );
        System.out.println(isDouble);
    }
}

/*
class Interface1 {
    public Interface1(){

    }
}
*/

