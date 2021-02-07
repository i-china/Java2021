package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class SuperDemo {

}

class FatherSuper {
    protected String name;
    public String hello(){
        return "hi " + name;
    }
}

class SonSuper extends FatherSuper {
    @Override
    public String hello(){
        return super.hello();
    }
}