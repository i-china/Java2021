package cn.pkage.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class PackageDemo {
    public PackageDemo(){
        System.out.println("cn.dsdfsdxx");
    }
    public static void main(String[] args) {
        System.out.println("cn.pkage.com.PackageDemo");
    }
    public static void getPub(){
        System.out.println("cn.pkage.com get pub");
    }
    protected void getPro(){
        System.out.println("get protected ");
    }
}
