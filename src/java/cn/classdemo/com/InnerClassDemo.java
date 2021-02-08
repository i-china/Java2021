package cn.classdemo.com;

import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("Hale");
        Outer o = new Outer("sdd");
        Outer.Inner oi = o.new Inner();
        Outer.Inner ii  = outer.new Inner();
        ii.hi();
    }
}

class Outer {
    private String name = "hale";
    Outer(String name){
        this.name = name;
    }
    class Inner {
        int age;
        void hi(){
            System.out.println("Inner ");
        }
    }
}
