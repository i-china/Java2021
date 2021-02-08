package com.java.cn;

import java.util.Arrays;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class CharString {
    public static void main(String[] args) {
        int[] i = {1,231,321,321,3,21,21321,123};
        Score sc = new Score(i);
//        System.out.println(sc);
        sc.printScore();
        i[0] = 999;
        sc.printScore();
        ByteDemo bd = new ByteDemo();
    }
}

class Score{
    private int[] scores;
    public Score(int[] scores){
        this.scores = scores;
    }
    public void printScore(){
        System.out.println(Arrays.toString(scores));
    }
}
class ByteDemo{
    ByteDemo(){
        byte[] b = "hello".getBytes();
        System.out.println(b);
    }
}
