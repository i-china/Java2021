package com.java.cn;

import javax.sound.midi.Soundbank;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class CharString {
    public static void main(String[] args) throws UnsupportedEncodingException {
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
    ByteDemo() throws UnsupportedEncodingException {
        byte[] b = "hello".getBytes();
        byte[] b1 = "Hello".getBytes("UTF-8");
        byte[] b2 = "hi".getBytes("GBK");
        byte[] b3 = "hi".getBytes(StandardCharsets.UTF_8);
        System.out.println(b3);
        System.out.println(b);
    }
}
