package com.java.cn;

import java.sql.SQLOutput;
import java.util.StringJoiner;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class StringJoinerDemo {
    public static void main(String[] args) {
       /* OneTest ot = new OneTest();
        String[] names = {"hale","root","admin"};
        StringBuilder sb = new StringBuilder();
        sb.append("Halle ");
        for(String name : names){
            sb.append(name).append(", ");
        }
        sb.delete(sb.length() -2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());

        stringJoin sj = new stringJoin();*/

        StringJoins sn = new StringJoins();
    }
}

class StringJoins {
    StringJoins(){
        String[] names = new String[]{"one", "tow", "foru "};
        StringJoiner sj = new StringJoiner(" , "," Hello ","!");
        String str = String.join(", ", names);
        for(String name : names){
            sj.add(name);
        }
        System.out.println(sj.toString());
        System.out.println(str);
    }
}

class stringJoin{
    stringJoin(){
        String[] names = {"assdf","two","three"};
        StringJoiner sj = new StringJoiner(", ");
        for(String name : names){
            sj.add(name);
        }
        System.out.println(sj.toString());
        for(String n : names ){
            System.out.println(n);
        }
    }
}

class OneTest{
    OneTest(){
        String[] names = {"one","tow","three"};
        StringJoiner sj = new StringJoiner(" ! ");
        for(String name : names){
            sj.add(name);
        }
        System.out.println(sj.toString());
    }
}

