package com.java.cn;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class StringDemo {
    public static void main(String[] args) {
        System.out.println(Integer.getInteger("java.version"));
        String1 s1 = new String1();
        String2 s2 = new String2();
        String3 s3 = new String3();
        String4 s4 = new String4();
        String5 s5 = new String5();
        FormatString fs = new FormatString();
//        valueDemo vd = new valueDemo();
        charDemo cd = new charDemo();

    }
}

class charDemo{
    charDemo(){
        char[] cs = "hale".toCharArray();
        System.out.println(cs);
        String sc = new String(cs);
//        System.out.println(sc);

        cs[0] = 'x';
        System.out.println(sc);
    }
}

class String1 {
    String1(){
        String s1 = "Hello ";
        String s2 = new String(new char[] {'H','e','l','l','o'});
    }
}

class String2{
    String2(){
        String s = "hello spring 2";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
    }
}

class String3{
    String3(){
        String s1 = "hale";
        String s2 = "Hale";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.toUpperCase() == s2);
        System.out.println(s2.toLowerCase() == s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase().equals(s1));
        System.out.println("Hale".contains("le"));
    }
}

class String4{
    String4(){
        int s1 =  "Hello".indexOf("l");
        int s2 = "hello".lastIndexOf("l");
        boolean s3 = "HJello".startsWith("e");
        System.out.println(s3);
        boolean s4 = "Hello ".endsWith("lo ");
        System.out.println(s4);
        String ss1 = "Hello".substring(3);
        System.out.println(ss1);
        String ss2 = "hello".substring(1,3);
        System.out.println(ss2);
        String ss3 = "Hel lo".trim();
        System.out.println(ss3);
//        String ss4 = "\u3000Hello\u3000".strip();
        String ss4 = "helllo";
        String ss44 = ss4.replace("l","w");
        System.out.println(ss44);
        String ss5 = "Helloworld";
        String ss55 = ss5.replaceAll("l","*");
        System.out.println(ss55);
        String ss6 = "hello.world.2021";
        String[] ss66 = ss6.split("\\.");
        System.out.println(ss66);
        for(String s66 : ss66){
            System.out.println(s66);
        }
    }
}

class String5{
    String5(){
        String[] sr = {"a","B","c"};
        String a = String.join("***",sr);
        System.out.println(a);
    }
}

class FormatString {
    FormatString(){
        String s = "hi %s age is %d";
//        System.out.println(s.formatted("Hale",23));
        System.out.println(String.format("hi %s, age is %d ","hale",34));
    }
}

class valueDemo{
    valueDemo(){
        String name = "Hale";
        String a = name.valueOf(123);
        String aa = String.valueOf(23.43);
        System.out.println(aa);
//        System.out.println(a);
        String b = String.valueOf(true);
        System.out.println(b);
        String c = String.valueOf(new Object());
        System.out.println(c);
        boolean d = Boolean.parseBoolean("true");
        System.out.println(d);
        boolean d1 = Boolean.parseBoolean("FALSE");
        System.out.println(d1);
        int e = Integer.getInteger("java.version");
        System.out.println(e);
    }
}