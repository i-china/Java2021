package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class ObjectDemo {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.setName("Hale","root");
        String name = p.getName();
        System.out.println(name);
    }
}

class Person1{
    private String[] name;
    public void setName(String... name){
        this.name = name;
    }
    public String getName(){
        for(String name : name){
            System.out.println(name);
        }
        return name[0];
    }
}
