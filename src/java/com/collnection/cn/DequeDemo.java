package com.collnection.cn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
// Deque : 双端队列
public class DequeDemo {
    public static void main(String[] args) {
        offerLast ol = new offerLast();
    }
}

class offerLast{
    offerLast(){
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerLast("C");
        deque.offerFirst("D");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}


class addDemo{
    addDemo(){

    }
}

