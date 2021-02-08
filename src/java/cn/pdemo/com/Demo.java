package cn.pdemo.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class Demo {
    public static void main(String[] args) {
        String s = "hello world! ";
        int ii = s.length();
        System.out.println(ii);
        if(ii > 10 ){
            int o = 10 - ii;
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        }
    }
}
