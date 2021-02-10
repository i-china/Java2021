package cn.methods.com;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public class ClassMethodDemo {
    public static void main(String[] args) throws Exception {
        Class c = Student4.class;
        System.out.println(c.getMethod("getScore",String.class));
        System.out.println(c.getMethod("getName"));
//        System.out.println(c.getMethod("getGrade"));
        System.out.println(c.getDeclaredMethod("getGrade", int.class));
    }
}

class Person4{
    public String getName(){
        return "Person";
    }
}

class Student4 extends Person4{
    public int getScore(String type){
        return 99;
    }
    private int getGrade(int year){
        return 1;
    }
}