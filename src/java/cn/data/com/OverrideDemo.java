package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class OverrideDemo {
    public static void main(String[] args){
        One o = new One();
        One on = new Two();
        Two t = new Two();
        t.run();
        o.run();
        on.run();
    }
}

class One {
    public void run(){
        System.out.println("One run");
    }
}

class Two extends One{
    @Override
    public void run(){
        System.out.println("Two run");
    }
}
