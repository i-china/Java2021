package com.iofile.cn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author HaleLv
 * @date 2021-02-15
 **/
public class InputStreamDemo {
    public static void main(String[] args) throws IOException{
        inputStreamTest ist = new inputStreamTest();
    }
}

class inputStreamTest{
    inputStreamTest() throws IOException{
        InputStream input = new FileInputStream("E:\\readme.txt");
        for (;;){
            int n = input.read();
            if(n == -1 ){
                break;
            }
            System.out.println(n);
        }
        input.close();
    }
}
