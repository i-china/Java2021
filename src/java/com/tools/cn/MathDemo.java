package com.tools.cn;

import com.sun.media.sound.SoftTuning;

import java.util.Random;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class MathDemo {
    public static void main(String[] args) {
//        One a = new One();
        RandomDemo rd = new RandomDemo();
        System.out.println(rd);
        RandomFor rf = new RandomFor();

        Random a = new Random(123);
        System.out.println(" random is " + a.nextInt());

    }
}

class RandomFor{
    RandomFor(){
        Random r = new Random(123);
        for(int i = 0; i < 10; i++){
            System.out.println(r.nextInt(100));
        }
    }
}

class RandomDemo {
    RandomDemo(){
        Random r = new Random();
        int a =   r.nextInt(100);
//        r.nextBytes();
        long l = r.nextLong();
        boolean bl = r.nextBoolean();
        float f = r.nextFloat();
        double d = r.nextDouble();
        int ii = r.nextInt(3);
        System.out.println(a + " " + l + " " + bl + "  " + r + " " + d  + " " + ii);
    }
}



class One {
    One(){
        int a = Math.abs(123);
        int b = Math.abs(-123);
        int c = (int) Math.pow(2,10);
        double pi = Math.PI;
        double e = Math.E;
        int s = (int) Math.sin(Math.PI/6);
        double r = Math.random() * 10 ;
        System.out.println(r);
        System.out.println(s);
        System.out.println(e);
        System.out.println(pi);
        System.out.println(c);
        System.out.println(a + b);

    }
}