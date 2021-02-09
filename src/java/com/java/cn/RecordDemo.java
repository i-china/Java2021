package com.java.cn;

import java.math.BigInteger;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class RecordDemo {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1232132321");
        System.out.println(bi.pow(5));
        BigNum bn = new BigNum();
        System.out.println(bn);
        BigInteger bb = new BigInteger("999999").pow(99);
        float f = bb.floatValue();
        byte be = bb.byteValue();
        int ins = bb.intValue();
        double bd = bb.doubleValue();
        System.out.println(bd);
        System.out.println(ins);
        System.out.println(be);
        System.out.println(f);
    }
}

class BigNum{
    BigNum(){
        BigInteger a = new BigInteger("1232132");
        BigInteger b = new BigInteger("123123213");
        BigInteger sum = a.add(b);
        System.out.println(sum);
    }
}


class RecordTest{
    RecordTest(){

    }
}