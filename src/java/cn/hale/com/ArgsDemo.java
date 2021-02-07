package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class ArgsDemo {
    public static void main(String[] args) {
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
