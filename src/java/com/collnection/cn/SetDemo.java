package com.collnection.cn;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class SetDemo {
    public static void main(String[] args) {
        Set1 s1 = new Set1();
        hashSetDemo hsd = new hashSetDemo();
    }
}

class Set1{
    Set1(){
        Set<String> set = new HashSet<>();
        System.out.println(set.add("abc"));
        System.out.println(set.add("hadoop"));
        System.out.println(set.add("hive"));
        System.out.println(set.contains("hbase"));
        System.out.println(set.contains("hadoop"));
        System.out.println(set.contains("flink"));
        System.out.println(set.remove("hello"));
        System.out.println(set.size());
    }
}
class hashSetDemo{
    hashSetDemo(){
//        Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("hadoop");
        set.add("hive");
        set.add("hbase");
        set.add("hdfs");
        for(String s : set){
            System.out.println(s);
        }
    }
}
