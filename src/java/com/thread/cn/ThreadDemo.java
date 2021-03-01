package com.thread.cn;

/**
 * @Author: HaleLv
 * @Date: 2021-03-01
 * @ProjectName Java2021
 */

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("main Start");
        Thread t = new Thread(){
            public void run(){
                System.out.println("thread run");
                System.out.println("thread end");
            }
        };
        t.start();
        System.out.println("main end");
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("start new thread!");
    }
}

