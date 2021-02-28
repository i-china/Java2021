package cn.array.com;

import com.sun.media.sound.SoftTuning;
import sun.java2d.pipe.SpanIterator;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Hale Lv
 * @created 2021-02-28 17:39
 * @project Java2021
 * int Integer
 * float Float
 * String String
 * boolean Boolean
 * char Character
 * double Double
 * short Short
 * long Long
 * byte Byte
 */
public class ArrayListDemo {
    public static void main(String[] args) {
     /*   ArrayList<String> list = new ArrayList<>();
        list.add("hale");
        System.out.println(list);
        list.add("Hale");
        boolean l = list.add("Alhe");
        int si = list.size();
        System.out.println(si);
        System.out.println(l);
        System.out.println(list);
        String s = list.get(1);
        System.out.println(s);
        String b = list.remove(2);
        System.out.println(b);
        fori();*/

     randomDemo();
    }
    /**
     *   @Description: fori
     *   @param: [] 
     *   @return: void
     */
    public static  void fori(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hale");
        list.add("wow");
        list.add("wows");
        list.add("wowss");
        list.add("wowsss");
        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        integerDemo();
    }
    /**
     *   @Description: integerDemo
     *   @param: [] 
     *   @return: void
     */
    public static void integerDemo(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.remove(1));
    }

    public static void randomDemo(){
        Random random = new Random();
        System.out.println(random);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Integer ints : list){
            System.out.println(ints);
        }
    }
}
