package com.data.cn;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        NullException ne = new NullException();
    }
}

class NullException{
    NullException(){
        String s = null;
        System.out.println(s.toString());
    }
}
