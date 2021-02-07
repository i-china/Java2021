package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class Main {
    public static void main(String[] args) {
        Person p = new Person("hgale",23);
        Student s = new Student("ss",12);
        Person sp = new Student("Studne ",23);
        Student ps = (Student) new Person("peron s",21);

        Student s1 = (Student)new Person("hi",23);
    }
}

class Person {
    protected String name;
    public int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    private int score;


    public Student(String name, int age) {
        super(name, age);
        this.score = score;
    }
}