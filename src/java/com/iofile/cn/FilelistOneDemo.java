package com.iofile.cn;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.SQLOutput;

/**
 * @author HaleLv
 * @date 2021-02-15
 **/
public class FilelistOneDemo{
    public static void main(String[] args) throws IOException{
        listFileDemo listFile = new listFileDemo();
    }
}

class listFileDemo{
    listFileDemo() throws IOException {
        File f = new File("E:\\");
        File[] fs = f.listFiles();
        printFiles(fs);
        File[] ff = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });
        printFiles(ff);
    }
    static void printFiles(File[] files){
        System.out.println(" --- ");
        if(files != null){
            for(File f : files){
                System.out.println(f);
            }
        }
        System.out.println(" --- ");
    }
}
