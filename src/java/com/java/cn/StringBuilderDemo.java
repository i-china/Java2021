package com.java.cn;

import com.sun.media.sound.SoftTuning;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class StringBuilderDemo {
    public static void main(String[] args) {
//        stringBuilder sb = new stringBuilder();
//        sbDemo sbd = new sbDemo();
        One one = new One();
    }
}

class One {
    One(){
        StringBuilder sb = new StringBuilder(10);
        sb.append("Mr")
                .append("hale")
                .append(" age")
                .append("  wow ")
                .insert(0," 2021 ");
        System.out.println(sb.toString());
    }
}

class sbDemo{
    sbDemo(){
        StringBuilder sb = new StringBuilder(1);
        for(int i = 0; i < 10; i++){
            sb.append('.');
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
class stringBuilder {
   stringBuilder(){
       String s = "";
        for(int i = 1; i < 10; i++){
            s = s + " , " + i;
            System.out.println(s);
        }

        StringBuilder sb = new StringBuilder(1024);
       for(int i = 0; i < 10 ; i++){
           sb.append(',');
           sb.append(i);
       }
       String ss = sb.toString();
       System.out.println(ss);
   }
}
