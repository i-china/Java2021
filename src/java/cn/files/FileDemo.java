package cn.files;

import java.io.File;

/**
 * @Author: HaleLv
 * @Date: 2021-03-01
 * @ProjectName Java2021
 */

public class FileDemo {
    public static void main(String[] args) {
        fileOne();

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
}
