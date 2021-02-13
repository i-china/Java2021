package com.collnection.cn;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
// Stack : LIFO : last in first out
public class StackDemo {
    public static void main(String[] args) {
        Stack1 s1 = new Stack1();
    }
}

class Stack1{
    Stack1(){
        String hex = toHex(12500);
        if(hex.equalsIgnoreCase("30D4")){
            System.out.println("ok");
        }else{
            System.out.println("faid");
        }
    }
    static String toHex(int n){
        return "";
    }
}

