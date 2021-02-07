package cn.data.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class InterfaceTestDemo  {
    public static void main(String[] args) {
        InterDemo id = new InterDemo();
        id.run();
        id.setName("Hale");
        String n = id.getName();
        System.out.println(n);

        InterTests it = new InterTests();
        it.say();
        it.setAge(23);
        int age = it.getAge();
        System.out.println(age);
        it.setName("Root");
        it.getName();
        it.run();

        List list  = new ArrayList();
        Collection coll = list;
    }
}

class InterDemo implements InterfaceDemo {
    private String name;
    @Override
    public void run(){
        System.out.println("Interface run ");
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class InterTests implements InterTest {
    protected int age;
    public String name;
    @Override
    public void run(){
        System.out.println("InterTests run ");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void say(){
        System.out.println("InterTests say ");
    }
    @Override
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public int getAge(){
        return age;
    }

}
