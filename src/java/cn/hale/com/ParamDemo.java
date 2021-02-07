package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class ParamDemo {
    public static void main(String[] args) {
        Person  p = new Person();
        String[] fullname = {"root","hale","dev"};
        p.setName(fullname);
        System.out.println(p.getName());
        fullname[0] = "Robbt";
        System.out.println(p.getName());
    }
}

class Person{
    private String[] name;
    public void setName(String[] name){
        this.name = name;
    }
    public String getName(){
        return this.name[0] + " " + this.name[1];
    }
}