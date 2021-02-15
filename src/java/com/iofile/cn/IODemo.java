package com.iofile.cn;

import com.sun.media.sound.SoftTuning;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;

/**
 * @author HaleLv
 * @date 2021-02-15
 **/
public class IODemo {
    public static void main(String[] args) throws Exception {
        File f = new File("E:\\Java2021\\io.exe");
//        System.out.println(f);
//        FileDemo fd = new FileDemo();
//        DemoFile df = new DemoFile();
        CreateFileDemo cfd = new CreateFileDemo();
//        cfd.createTempFileDemo();
        ListFileTest lfd = new ListFileTest();

    }
}

class ListFileTest{
    ListFileTest() throws IOException {
        File f = new File("E:\\");
        File[] fs1 = f.listFiles();
//        printFiles(fs1);
        System.out.println(fs1);
    }
}

class CreateFileDemo{
    CreateFileDemo() throws IOException {
        File f = new File("E:\\Java2021\\newFile.txt");
        File f1 = new File("E:\\test.txt");
        if(f1.createNewFile()){
            System.out.println("ok");

        }
        if(f1.delete()){
            System.out.println("yes del ");
        }else{
            System.out.println("no ");
        }
    }
    void createTempFileDemo() throws IOException {
        File f = File.createTempFile("tmp-","txt");
        f.deleteOnExit();
        System.out.println(f.isFile());
        System.out.println(f.getAbsolutePath());
    }
}


class DemoFile{
    DemoFile(){
        File f = new File("E:\\Java2021");
        File f1 = new File("E:\\java2021");
        File f2 = new File("E:\\Java2021\\io.exe");
        File d1 = new File("E:\\Java2021");
        System.out.println(f.canRead());
        System.out.println(d1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f.isFile());
        System.out.println(f1.isFile());
    }
}
class FileDemo{
    FileDemo() throws IOException {
        File f = new File("E:\\Java2021");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(File.separator);
    }
}


