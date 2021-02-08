package cn.array.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int aa = 0;
        for (int i = 0; i < a.length -1 ; i++) {
            aa = a[i];
            System.out.println(aa);
        }

        for(int ai : a ){
            System.out.println(ai);
        }
        System.out.println(a);
        System.out.println(ForDemo());
    }

    public static String ForDemo(){
        int[] ab = {1,2,3,4,5,56,6,7,8};
        return ab.toString();
    }
}


