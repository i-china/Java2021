package com.queue.cn;

import cn.pdemo.com.Demo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/

//  Queue  :  FIFO : first in first out
public class QueueDemo {
    public static void main(String[] args) {
//        Queue1 q = new Queue1();
//        peekDemo pd = new peekDemo();
//        addDemo ad = new addDemo();
        removeDemo rd = new removeDemo();
    }
}

class removeDemo{
    removeDemo(){
        Queue<String> ue = new LinkedList<>();
        ue.add("remove hadoop");
        ue.add("hive ");
        ue.add("hbase");
        ue.add("Hale");
        System.out.println(ue.remove());
        for(String s : ue){
            System.out.println(s);
        }
    }
}

class addDemo{
    addDemo(){
        Queue<String> ue = new LinkedList<>();
        ue.offer("add demo");
        ue.add("add hive");
        System.out.println(ue.poll());
    }
}


class Queue1{
    Queue1(){
        Queue<String> q = new LinkedList<>();
        q.offer("hadoop");
        q.offer("hive");
        q.offer("hbase");
        q.offer("flink");
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}

class peekDemo{
    peekDemo(){
        Queue<String> ue = new LinkedList<>();
        ue.offer("hadoop");
        ue.offer("hive");
        ue.offer("hbase");
        System.out.println(ue.peek());
        System.out.println(ue.peek());
    }
}

