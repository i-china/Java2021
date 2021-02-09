package com.data.cn;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class MainThrowException {
    public static void main(String[] args) throws Exception {
        byte[] bs = toGBK("Chiense");
        System.out.println(Arrays.toString(bs));
    }
    static byte[] toGBK(String s) throws UnsupportedEncodingException
    {
        return s.getBytes("GBK");
    }
    static byte[] getGBk(String s){
        try{
            return s.getBytes("GBK");
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return null;
    }
}
