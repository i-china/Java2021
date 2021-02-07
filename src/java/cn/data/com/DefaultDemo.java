package cn.data.com;

/**
 * update emjoy
 * interface default
 * @author HaleLv
 * @date 2021-02-08
 **/
public class DefaultDemo {
    public static void main(String[] args) {
        DefaultTest dt = new DefaultTest("Hale");
        dt.run();
    }
}

interface Default {
    String getName();
    default void run(){
        System.out.println(getName() + " run ");
    }
}

class DefaultTest implements Default{
    private String name;
    public DefaultTest(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
