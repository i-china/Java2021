package cn.array.com;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.zip.Adler32;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class MoreArrayDemo {
    public static void main(String[] args) {
        more();
//        ab();
        deep();
        three();
    }

    public static void deep(){
        int[][] ad = {
                {12,12321,3},
                {123,21321,321,32},
                {1231321,21321321,111}
        };
        System.out.println(Arrays.deepToString(ad));
    }


    public static void more(){
        int[][] more = {
                {1,23,3,4,45},
                {123,21213,21232,21,3},
                {14,45,67,234,12},
        };
        System.out.println(more.length);
        System.out.println(more[1][2]);
    }
    public static void ab(){
        int[][] arr = {
                {1,23,2132},
                {123,21},
                {12321,213,232,12,32,1}
        };
        for(int[] ar : arr){
            for(int a : ar){
                System.out.println(a);
                System.out.println('|');
            }
        }
    }

    public static void three(){
        int[][][] thr = {
            {
                    {12321,1231,231},
                    {123,21,321,3},
            },{
                    {12,3,21,321,3},
                    {1,2321,321,21321}
            },
                {
                        {123213,21323,123},
                        {12321,12321,123}
                }
        };
        System.out.println(Arrays.deepToString(thr));
    }
}
