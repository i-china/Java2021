package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class SuperDemo {
    public static void main(String[] args) {
        FatherSuper sf = new FatherSuper(name);
//        sf.age = 24;
    }
}

class FatherSuper {
//    protected final String name;
//    public final int age = 23;
    public final int age;

   /* public FatherSuper(String name,int age){
        this.name = name;
        this.age = age;
    }*/

   public FatherSuper(int age){
       this.age = age;
   }

    public String hello(){
        return "hi " + name;
    }
    public final String hi(){
//        age = 23;
        return "hi final" + name;
    }
}

class SonSuper extends FatherSuper {
    SonSuper() {
        super(name);
    }

    @Override
    public String hello(){
        return super.hello();
    }

    /*public String hi(){

    }*/
}