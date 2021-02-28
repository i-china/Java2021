package cn.sys.com;

/**
 * @author Hale Lv
 * @created 2021-02-27 11:42
 * @project Java2021
 */
public class SystemDemo {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 999; i++) {
            System.out.println(i);
        }
        
    }
}
