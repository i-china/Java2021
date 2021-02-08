package com.data.cn;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class IntegerDemo {
    public static void main(String[] args) {
//        IntegerOne io = new IntegerOne();
//        AutoBox ab = new AutoBox();
//        System.out.println(ab);
//        EqualTest et = new EqualTest();
        Bytes bytes = new Bytes();

    }
}

class EqualTest{
    EqualTest(){
        Integer nn = new Integer(100);
        Integer na = Integer.valueOf(100);

        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y " + (x == y));
        System.out.println("m == n " + (m == n));

        System.out.println("x.equals(y)" + x.equals(y));
        System.out.println("m.equals(n)" + m.equals(n));
    }
}

class Num{
    Num(){
        Number num = new Integer(100);
        byte b = num.byteValue();
        int n = num.intValue();
        long ln = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
    }
}

class Bytes{
    Bytes(){
        byte x = -1;
        byte y = 127;
        System.out.println(Byte.toUnsignedInt(x));
        System.out.println(Byte.toUnsignedInt(y));
    }
}

class AutoBox{
    AutoBox(){
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        int i = 100;
        Integer n = Integer.valueOf(i);
        int x = n.intValue();
        Integer nn = 100;
        int xx = nn;
        System.out.println(xx);
        int x1 = Integer.parseInt("100");
        int x2 = Integer.parseInt("100",16);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(Integer.toString(100));
        System.out.println(Integer.toString(100,36));
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toBinaryString(100));
    }
}

class IntegerOne {
    IntegerOne(){
        int i = 10;
        Integer n1 = new Integer(i);

        Integer n2 = Integer.valueOf(i);

        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());
    }
}
