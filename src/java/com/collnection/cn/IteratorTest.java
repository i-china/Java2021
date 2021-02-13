package com.collnection.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class IteratorTest {
    public static void main(String[] args) {
        forIterator fi = new forIterator();
        Fori f = new Fori();
    }
}

class Fori{
    Fori(){
        List<String> list = new ArrayList<>();
        list.add("admin");
        list.add("hadoop");
        list.add("user");
        list.add("hdfs");
        for(int i =0; i < list.size(); i++){
            Object value = list.get(i);
        }
        System.out.println(list);
    }
}

class forIterator{
    forIterator(){
        List<String> list = new ArrayList<>();
        list.add("admin");
        list.add("hadoop");
        list.add("user");
        list.add("hdfs");
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }
    }
}

class forEachDemo{
    forEachDemo(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("hadoop");
        list.add("2");
        list.add("hdfs");
        for(String s : list){
            System.out.println(s);
        }
    }
}