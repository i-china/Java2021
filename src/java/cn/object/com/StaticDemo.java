package cn.object.com;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class StaticDemo {
    public static void main(String[] args) {
        One on = new One("Hale",12,23);
        One ne = new One("hale",123,12);
        on.number++;
        System.out.println(on.number);
        on.number++;
        System.out.println(on.number);
        ne.number++;
        System.out.println(ne.number);
        One.number = 23;
        System.out.println(One.number);

    }

}

class One {
    private String name;
    public int age;
    public static int number;

    public One(String name, int age, int number){
        this.name = name;
        this.age = age;
        this.number = number;
    }
}
