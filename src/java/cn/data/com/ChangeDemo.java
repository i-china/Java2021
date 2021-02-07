package cn.data.com;

import javax.sound.midi.Soundbank;

public class ChangeDemo {
    public static void main(String[] args) {
        Son s = new Son("son",12,23,23);
        Father f = new Father("fa",23,231);
        Father ff = s;
        Object o = s;
        Object of = f;
        Father fs = new Son("sons",23,231,213);
        System.out.println(fs);
        System.out.println(of);
        Object obj = null;

        Object os = "Hello";
        String ss = (String) os;
        if(ss instanceof String ) {
            System.out.println(ss.toUpperCase());
        }else{
            System.out.println("not  ok ");
        }

        System.out.println(s instanceof Father);
        System.out.println(ff instanceof Son);
        System.out.println(fs instanceof Son);
        System.out.println(f instanceof Son);
        System.out.println(f instanceof Object);
        System.out.println(obj instanceof Object);
    }
}


class Father {
    private double money;
    protected int age;
    public String name;

   /* public Father(){

    }*/
    public Father(String name, int age, double money){
        this.name = name;
        this.age = age;
        this.money = money;
    }
}

class Mother {
    protected String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}


class Son extends Father {
    protected double salary;
    protected Mother mother;
    protected int score;

   /* public Son(){

    }*/
    public Son(String name,int age, double money, double salary){
        super(name,age,money);
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String sayHello(){
        return "hi " + name;
    }
}

/*
class Son extends Mother {

}*/
