package com.thread.cn;

/**
 * @Author: HaleLv
 * @Date: 2021-03-01
 * @ProjectName Java2021
 */

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread();
        thread.start();
        MyThread mt = new MyThread();
        mt.run();

        Thread newt = new Thread(() -> {
            System.out.println("start new thread new one");
        });
        newt.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("start new thread!");
    }
}

