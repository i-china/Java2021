package cn.pdemo.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class publicDemo {
    public static void main(String[] args){
//        System.out.println("new object");
        Inner ins = new Inner();
        ins.hi();
    }

    public void getPublic(){

    }
    protected void getProtected(){

    }
    private static void getPrivate(){
        System.out.println("private");
    }
    static class Inner {
        public void hi(){
            publicDemo.getPrivate();
        }
    }
}
