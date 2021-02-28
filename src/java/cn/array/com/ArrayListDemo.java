package cn.array.com;

import com.sun.media.sound.SoftTuning;

import java.util.ArrayList;

/**
 * @author Hale Lv
 * @created 2021-02-28 17:39
 * @project Java2021
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
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
        fori();
    }

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
    }

}
