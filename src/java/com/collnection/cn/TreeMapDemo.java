package com.collnection.cn;

import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap1 tm = new TreeMap1();
    }
}

class TreeMap1{
    TreeMap1(){
        Map<String,Integer> map = new TreeMap<>();
        map.put("orange",1);
        map.put("apple",2);
        map.put("hadoop",3);
        for(String key : map.keySet()){
            System.out.println(key);
        }
    }
}
