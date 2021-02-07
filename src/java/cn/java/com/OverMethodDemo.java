package cn.java.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class OverMethodDemo {
    private String name;
    private int age;
    public void OverMethodDemo(){

    }
    public void OverMethodDemo(String name){
        this.name = name;
    }
    public void OverMethodDemo(String name, int age){
        if(age < 18){
            System.out.println(name);
        }else{
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        String s = "o test String o k ";
        int n1 = s.indexOf('t');
        System.out.println(n1);
        int n2 = s.indexOf('t',2);
        System.out.println(n2);
        int n3 = s.lastIndexOf("o",3);
        System.out.println(n3);
    }
}
