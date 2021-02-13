package com.queue.cn;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class PriorityQueueDemo {
    public static void main(String[] args) {
//        offerDemo od = new offerDemo();
//        Queue<User> ue = new PriorityQueue<>(new UserComparator());
//        Queue<User> ue = new PriorityQueue<>(new UserComparator());
        Queue<User> ue = new LinkedList<>();        // 先用Queue代替， PriorityQueue暂无法实现
        ue.offer(new User("Hale","123"));
        ue.offer(new User("root","3321"));
        ue.offer(new User("Java","321"));
        System.out.println(ue.poll());
        System.out.println(ue.poll());
        System.out.println(ue.poll());
    }
}

class UserComparator implements Comparable<User>{
    public int compare(User u1, User u2){
        if(u1.number.charAt(0) == u2.number.charAt(0)){
            return u1.number.compareTo(u2.number);
        }
        if(u1.number.charAt(0) == 'V'){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}

class User{
    public final String name;
    public final String number;
    public User(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return name + " / " + number;
    }
}


class offerDemo{
    offerDemo(){
        Queue<String> ue = new PriorityQueue<>();
        ue.offer("Hadoop");
        ue.offer("hive");
        ue.offer("hbase");
        System.out.println(ue.poll());
        System.out.println(ue.poll());
    }
}
