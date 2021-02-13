package com.collnection.cn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
//        Properties1 p1 = new Properties1();
//        System.out.println(p1);
        Properties2 p2 = new Properties2();
        System.out.println(p2);
    }
}

class Properties2{
    Properties2() throws IOException {
        Properties props = new Properties();
        props.setProperty("url", "http://www.liaoxuefeng.com");
        props.setProperty("language", "Java");
        props.store(new FileOutputStream("C:\\Users\\iFaithFreedom\\IdeaProjects\\Java2021\\src\\java\\com\\collnection\\cn\\Collection.properties"), "这是写入的properties注释");
    }
}

class Properties1{
    Properties1() throws IOException {
//        String f = "Collection.properties";
        Properties props = new Properties();
//        props.load(new java.io.FileInputStream(f));
        props.load(getClass().getResourceAsStream("C:\\Users\\iFaithFreedom\\IdeaProjects\\Java2021\\src\\java\\com\\collnection\\cn\\Collection.properties"));
        String filepath = props.getProperty("last_open_file");
        String interval = props.getProperty("auto_save_interval","123");
    }
}
