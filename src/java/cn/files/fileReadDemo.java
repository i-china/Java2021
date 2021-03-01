package cn.files;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Author: HaleLv
 * @Date: 2021-03-01
 * @ProjectName Java2021
 */

public class fileReadDemo {
    public static void main(String[] args) throws IOException {
        fileReadOne();
    }

    public static void fileReadOne() throws IOException {
        Reader reader = new FileReader("e:\\e.txt");
        for (;;){
            int n = reader.read();
            if(n == -1)
                break;
            System.out.println((char)n);
        }
        reader.close();
    }
}
