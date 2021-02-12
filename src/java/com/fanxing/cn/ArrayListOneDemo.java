package com.fanxing.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/

public class ArrayListOneDemo{
    public static void main(String[] args) {
        /*Person[] ps = new Perosn[] {
            new Person("B",23);
        };*/
        String[] ss = new String[] {"one","two","Three"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));
        List list = new ArrayList();
        list.add("Hale");
        list.add("world");
        String first = (String) list.get(0);
        String second = (String) list.get(1);

        List<String> l2 = new ArrayList<String>();
        l2.add("wow");
        l2.add("new");
        String f2 = (String) l2.get(0);
        String f22 = (String) l2.get(1);
        System.out.println(f2);

        List<Number> l3 = new ArrayList<Number>();
        l3.add(123);
        l3.add(324);
        System.out.println(l3.get(0));

        List<Float> f3 = new ArrayList<>();
        f3.add((float) 123.32);
        System.out.println(f3.get(0));
    }
}


