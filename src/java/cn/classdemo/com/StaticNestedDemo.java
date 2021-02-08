package cn.classdemo.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class StaticNestedDemo {
    public static void main(String[] args) {
//        OuterDemo od = new OuterDemo("Hale ok");
//        OuterDemo.StaticNestedDemo os = od.new StaticNestedDemo();
        OuterDemo.StaticNestedDemo os = new OuterDemo.StaticNestedDemo();
        os.hello();
    }
}

class OuterDemo{
    private static String NAME = "Hale";

    private String name;

    OuterDemo(String name){
        this.name = name;
    }

    static class StaticNestedDemo{
        void hello(){
            System.out.println("Helki " + OuterDemo.NAME);
        }
    }

}