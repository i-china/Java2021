package com.collnection.cn;


import java.util.HashMap;
import java.util.Map;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class MapDemo {
    public static void main(String[] args){
        MapDemo1 md = new MapDemo1("Hale",123);
        Map<String,MapDemo1> map1  = new HashMap<>();
        map1.put("Hale",md);
        MapDemo1 map11 = map1.get("Hale");
        System.out.println(map11 == md);
        System.out.println(map11.score);
        MapDemo1 md1 = map1.get("Kali");
        System.out.println(md1);

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Kali",123);
        System.out.println(map2.get("Kali"));

        ForMapDemo fmd = new ForMapDemo();
    }
}

class ForMapDemo{
    ForMapDemo(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Hadoop",123);
        map.put("Hive",321);
        map.put("Flink",666);
        for(String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}

class MapDemo1{
    public String name;
    public int score;
    MapDemo1(String name, int score){
               this.name = name;
               this.score = score;
    }
}

