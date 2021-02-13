package com.collnection.cn;

import com.sun.media.sound.SoftTuning;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class ListDemo {
    public static void main(String[] args) {
        ListDemo1 ld = new ListDemo1();

//        List<String> List = new ArrayList<>();
//        List<String> list = new ArrayList<>(List.of("Hale","wer"));
   /*     for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }*/
        IteratorDemo it = new IteratorDemo();
        ListtoArray lr = new ListtoArray();
        lr.listtoArr();
        lr.itera();
        lr.inter();
    }
}

class ListtoArray{
    ListtoArray(){
        List<String> list = new ArrayList<>();
        list.add("Hadoop");
        list.add("Spark");
        list.add("Flume");
        Object[] arrays = list.toArray();
        for(Object ar : arrays) {
            System.out.println(ar);
        }
    }
    void listtoArr(){
        List<String> list = new ArrayList<>();
        list.add("Hive");
        list.add("flink");
        String[] str = list.toArray(new String[3]);
        for(String s : str){
            System.out.println(s);
        }
    }
    void itera(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(123);
        Number[] ns = list.toArray(new Number[3]);
        for(Number s : ns){
            System.out.println(s);
        }
    }
    void inter(){
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        Integer[] ins = list.toArray(new Integer[list.size()]);
//        Integer[] inss = list.toArray(Integer[]::new);
        /*Integer[] insss = {123,12321};
        List<Integer> lis = list.indexOf(insss);*/
        System.out.println(ins);
    }
}

class ListDemo1{
    ListDemo1(){
        List<String> a = new ArrayList<>();
        a.add("apple");
        a.add("hadoop");
        a.add("mapreduce");
        String b = a.get(1);
        System.out.println(b);
        System.out.println(a.size());

        for(Iterator<String> it = a.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }
    }
}

class IteratorDemo {
    IteratorDemo(){
        List<String> list = new ArrayList<>();
        list.add("hadoop");
        list.add("hive");
        list.add("spark");
        System.out.println(list);

        for(String li : list) {
            System.out.println(li);
        }
        Iterator<String> it = list.iterator();
        it.hasNext();
        String s = it.next();
        String ss = it.next();
        for(;it.hasNext();){
            String sss = it.next();
            System.out.println(sss);
        }
        System.out.println("iterator : " + s + ss );
       /* for(Iterator<String> it = list.iterator(); it.hasNext();){
            String si = it.next();
            System.out.println(si);  // hadoop hive spark
        }*/
    }
}
