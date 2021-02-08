package cn.classdemo.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class asyncHelloDemo {
    public static void main(String[] args) {
        asOuter ao = new asOuter("Hale");
        ao.asyncHello();
    }
}


class asOuter {
    private String name;

    asOuter(String name){
        this.name = name;
    }

    void asyncHello(){
//       类型            实例化
        Runnable r = new Runnable(){

            @Override
            public void run() {
                System.out.println("hi d " + asOuter.this.name);
            }
        };
        new Thread(r).start();
    }
}
