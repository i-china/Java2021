package com.data.cn;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class CatchDemo {
    public static void main(String[] args) {
        throwsTest tt = new throwsTest();
        OneDemo od = new OneDemo();
    }
}

class BaseException extends RuntimeException{
    public BaseException(){
        super();
    }
    public BaseException(String name, Throwable cause){
        super(name,cause);
    }
    public BaseException(String name){
        super();
    }
    public BaseException(Throwable cause){
        super(cause);
    }
}

class UserNotFoundException extends BaseException{

}

class LoginFaileException extends BaseException{

}



class staticTry{
  /*  staticTry(){
        static void process1(int age){
            if(age <= 0){
                throw new IllegalArgumentException();
            }
        }
    }*/
}

class OneDemo{
    OneDemo(){
        try{
            Integer.parseInt("abc");
        }catch(Exception e ){
            System.out.println("Cat");
            throw new RuntimeException(e);
        }finally{
            System.out.println("final");
            throw new IllegalArgumentException();
        }
    }
}

class OneTset9{
    OneTset9(){
        try{
            Integer.parseInt("acb");
        }catch(Exception e){
            System.out.println("Catched");
            throw new RuntimeException(e);
        }finally {
            System.out.println("finally");
        }
    }
}

class throwsTest{
    throwsTest(){
        try{
            process1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static void process1(){
        process2();
    }
    static void process2(){
        Integer.parseInt(null);
    }
    void procees(String s){
        if(s == null){
            throw new NullPointerException();
        }
    }
    void process4(String s){
        try{

        }catch(NullPointerException e){
            throw new IllegalArgumentException();
        }
    }
}

class CatchOne{
  /*  CatchOne(){
        try{
//            process1();
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }*/
 /* void ttry(){
      try{

      }catch(UnsupportedEncodingException e){
          System.out.println(e);
      }catch(IOException e){
          System.out.println(e);
      }
  }*/

/*    void finalTest(){
        try{

        }catch(UnsupportedEncodingException e){

        }catch(IOException e){

        }finally {
            System.out.println("end ");
        }
    }*/
    /*void moreTry{
        try{

        }catch(IOException | NumberFormatException e){

        }catch(Exception e){

        }finally {

        }
    }*/
}
