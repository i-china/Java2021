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

        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for(Class ii : is){
            System.out.println(ii);
        }

        Class ss = Integer.class.getSuperclass();
        Class[] cs = ss.getInterfaces();
        for(Class ci : cs){
            System.out.println(ci);
        }
    }
}

/*
class Interface1 {
    public Interface1(){

    }
}
*/

