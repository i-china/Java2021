package com.java.cn;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class StringBuilderDemo {
    public static void main(String[] args) {
        stringBuilder sb = new stringBuilder();
    }
}

class stringBuilder {
   stringBuilder(){
       String s = "";
        for(int i = 0; i < 1000; i++){
            s = s + " , " + i;
        }
   }
}
