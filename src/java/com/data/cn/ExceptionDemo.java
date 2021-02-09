package com.data.cn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class ExceptionDemo {
    public static void main(String[] args) {
//        One one = new One();
//        one.readFileTest();
//        TryCatchDemo td = new TryCatchDemo();

    }
}

class tryCatchTest{
    tryCatchTest(){
       byte[] bs = toGBK("Chinese");
        System.out.println(Arrays.toString(bs));
    }

   static byte[] toGBK(String s){
        try{
            return s.getBytes("GBK");
        }catch(UnsupportedEncodingException e){
            System.out.println(e);
            return s.getBytes();
        }
   }
}

class One{
    One(){
        String s = "anc";
//        java.lang.NumberFormatException: For input string: "anc"
        int n = Integer.parseInt(s);
    }
    void readFileTest(){
        String t = readFile("c://test.txt");
    }

    private String readFile(String s) {
        return s;
    }

    public static int returnNum(){
        int code = processFile("C:\\test.txt");
        if(code == 0){
            System.out.println("ok");
        }else{
            switch(code) {
                case 1:
                    System.out.println("file not found");
                case 2:
                    System.out.println("no read permission");
                default:
                    System.out.println("unknow error !");
            }
        }
        return code;
    }

    private static int processFile(String s) {
        return 0;
    }
}

class TryCatchDemo {
    TryCatchDemo(){
        try{
//            String s = processFile("c:\\test.txt");
//        }catch(FileNotFoundException e){
//            System.out.println("not found");
//        }catch(SecurityException e){
//            System.out.println("no security Exception ");
//        }catch(IOException e){
//            System.out.println("io exception");
        }catch(Exception e){
            System.out.println("otehr eror ");
        }
    }

}
