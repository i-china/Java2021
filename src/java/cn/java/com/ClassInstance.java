package cn.java.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class ClassInstance {
    public static void main(String[] args) {
        Persons p = new Persons("Hale",23);
        System.out.println(p.getName() + p.getAge());
    }
}

class Person{
    private int age;
    public String name;

    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
}
