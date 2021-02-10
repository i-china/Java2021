package cn.methods.com;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class ExtendDemo {
    public static void main(String[] args) {
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);

        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
    }
}

