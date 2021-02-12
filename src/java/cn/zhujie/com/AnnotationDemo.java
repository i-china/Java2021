package cn.zhujie.com;

import javax.annotation.Resource;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class AnnotationDemo {
    public static void main(String[] args) {
//        Hello h = new Hello();
//        System.out.println(h.x);
        One one = new One();
    }

}

class One{
    One(){
        System.out.println("Construct");
    }
}

/*class Hello{
    @Check(min=0,max=100,value=66)
    public int n;
    @Check(value=99)
    public int p;
    @Check(99)
    public int x;
    @Check
    public int y;
}*/

