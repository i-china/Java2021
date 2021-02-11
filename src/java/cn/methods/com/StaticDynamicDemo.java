package cn.methods.com;


/**
 * @author HaleLv
 * @date 2021-02-11
 **/
public class StaticDynamicDemo {
    public static void main(String[] args) {
        Father1 f1 = new Son1();
        f1.hi();
    }
}

interface Father1{
    void hi();
}

class Son1 implements Father1{
    public void hi(){
        System.out.println("hi");
    }
}