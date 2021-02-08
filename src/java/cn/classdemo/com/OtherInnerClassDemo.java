package cn.classdemo.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class OtherInnerClassDemo {
    public static void main(String[] args) {
        OtherOuter oo = new OtherOuter(123);
        OtherOuter.Inner oi = oo.new Inner();
        oi.hi(23);

    }
}

class OtherOuter {
    private int age;
    OtherOuter(int age){
        this.age = age;
    }
    class Inner{
        void hi(int age){
            System.out.println(OtherOuter.this.age);
        }
    }
}
