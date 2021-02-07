package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class AbstractDemo {
    public static void main(String[] args) {
//    abOne ab = new abOne();
        abTwo at = new abTwo();

    }
}


abstract class abOne {
    public abstract void run();
}

class abTwo extends abOne {
    @Override
    public void run(){
        System.out.println("abTwo run ");
    }
}