package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class ShiLiVariable {
//    实例变量对子类可见
    public String name;
    private double salary;

    public ShiLiVariable(String empName){
        name = empName;
    }
    public void setSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmp(){
        System.out.println("name is " + name);
        System.out.println("salary is " + salary);
    }

    public static void main(String[] args) {
        ShiLiVariable sl = new ShiLiVariable("hale");
        sl.setSalary(123.32);
        sl.printEmp();
    }
}
