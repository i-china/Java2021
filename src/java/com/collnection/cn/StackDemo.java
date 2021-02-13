package com.collnection.cn;

import java.util.Deque;
import java.util.LinkedList;

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
    static String toHex(int n) {
        Deque<String> q = new LinkedList<>();
        do {
            int i = n / 16;
            int j = n % 16;
            n = i;

//            q.push("%x".formatted(j));
        } while (n != 0);

        StringBuilder sb = new StringBuilder();
        while (q.peek() != null) {
            sb.append(q.pop());
        }
        return sb.toString();
    }
}

