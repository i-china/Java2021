package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class VariableType {

    static int allClicks = 0;  // 类变量
    int ObjClick = 0;       // 实例变量
    public static void main(String[] args) {
        int InnerClick = 0;  // 局部变量
//        变量类型:
//        声明三个int整型数： a b c
        int a,b,c;
//        声明三个整数并赋予初值
        int d = 3, e = 4, f = 5;
//        声明并初始化z
        byte z = 22;
//        声明并初始化字符串s
        String s = "hale";
//        声明双精度浮点型变量 pi
        double pi = 3.1415926;
//        声明变量x的值是字符 x
        char x = 'x';
//        java 支持的变量类型有：
/*

        类变量：独立于方法之外的变量，用static修饰
        实例变量：独立于方法之外的变量，没有static修饰
        局部变量： 类的方法中的变量
*/

    }
}


