package com.daily_job._202007;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
//        ExecutorService executor = Executors.newSingleThreadExecutor();  //创建单个线程的线程池，用于执行有序的线程任务
        ExecutorService executor = Executors.newFixedThreadPool(20);
        for (int i =0 ;i < 20; i++){
//            Thread.sleep(1000);       //可以通过使线程睡眠实现线程的有序性
            executor.execute(thread1);

        }
    }
}

class Thread1 implements Runnable{


    volatile int i =0;
    @Override
    public void run() {
        i++;
        System.out.println("当前i的值为："+i);
    }
}
