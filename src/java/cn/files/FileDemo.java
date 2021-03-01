package cn.files;

import cn.hale.com.For2021;
import com.sun.javafx.image.IntToIntPixelConverter;
import com.sun.org.apache.bcel.internal.generic.FieldOrMethod;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * @Author: HaleLv
 * @Date: 2021-03-01
 * @ProjectName Java2021
 */

public class FileDemo {
    public static void main(String[] args) throws Exception {
//        fileOne();
//        inputStreamDemo();
//        outStreamDemo();
//        writeFile();

    }
    public static void fileOne(){
        File f = new File("E:/e.txt");
        System.out.println(f);
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        if(f.delete()){
            System.out.println("ok");
        }
    }

    public static void inputStreamDemo() throws IOException {
        String s;
        InputStream fileinput = new FileInputStream("E:\\e.txt");
        for(;;){
            int n = fileinput.read();
            if(n == -1){
                break;
            }
            System.out.println(n);
        }
        fileinput.close();
    }

    public static void outStreamDemo() throws Exception{
        OutputStream outputStreamDemo = new FileOutputStream("e:\\e.txt");
        outputStreamDemo.write(101);
        outputStreamDemo.write(102);
        outputStreamDemo.write(103);
        outputStreamDemo.close();
    }

    public static void writeFile() throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("out\\out.txt");
        fileOutputStream.write("hello " .getBytes("utf-8"));
        fileOutputStream.close();

        InputStream file = new FileInputStream("e:\\e.txt");
        InputStream bufferedInputStream = new BufferedInputStream(file);
        InputStream gzipInputStream = new GZIPInputStream(bufferedInputStream);



    }
}
