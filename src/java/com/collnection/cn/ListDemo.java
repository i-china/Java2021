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
        System.out.println("iterator : " + s + ss );
       /* for(Iterator<String> it = list.iterator(); it.hasNext();){

        }*/
    }
}
