package com.collnection.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/

public class CollectionsDemo{
    public static void main(String[] args) {
        Collections1 c1 = new Collections1();

    }
}

class Collections1{
    Collections1(){
        List<String> list = new ArrayList<>();
        list.add("Admin");
        list.add("root");
        list.add("hadoop");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
