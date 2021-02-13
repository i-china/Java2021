package com.collnection.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/

// Collection  :  List:youxu Set:quchong Map:jianzhidui
public class CollectionDemo {
    public static void main(String[] args) {
        test t = new test();

    }
}

class test{
    String[] ss = new String[10];
    test(){
        ss[0] = "hi";
        String a = ss[0];
        System.out.println(a);
    }
    List<String> list = new ArrayList<>();  // only String type
    List<Integer> ins = new ArrayList<>();  // only Integer Type
// Iterator bina li Collection  java.util
}


