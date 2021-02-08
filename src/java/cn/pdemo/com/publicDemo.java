package cn.pdemo.com;

import cn.pkage.com.PackageDemo;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class publicDemo {
    public static void main(String[] args){
//        System.out.println("new object");
        Inner ins = new Inner();
        ins.hi();
        Prodemo pd = new Prodemo();
        pd.getProtected();

        PackageDemo pdd = new PackageDemo();
//        pdd.getClass();
    }

    public void getPublic(){

    }
    protected void getProtected(){
        System.out.println("protected ");
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

class Prodemo extends publicDemo {
    void foo(){
        getProtected();
    }
    PackageDemo pdd = new PackageDemo();

}

class Hello {
    void hi(String name){
        String s = name.toLowerCase();
        int len = s.length();
        if(len < 10){
            int p = 10 - len;
            for( int i = 0; i < 10; i++) {
                System.out.println();
            }
        }
    }
}

final class FinalDemo {
    public final String name = "ij";
    private int n = 0;
    protected void hi(int t){
        long i = t;
    }
    protected final void fin(){
//        name = "hale";
        System.out.println("final");
    }


}