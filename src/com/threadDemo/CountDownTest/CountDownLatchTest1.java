package com.threadDemo.CountDownTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 主线程等待子线程执行完成再执行
 */
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//
//        ExecutorService executorService2 = Executors.newFixedThreadPool(1);
//
//        ExecutorService executorService3 = Executors.newScheduledThreadPool(1);
//
//        ExecutorService executorService4 = Executors.newSingleThreadScheduledExecutor();
public class CountDownLatchTest1 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(5);

        System.out.println("主线程 " + Thread.currentThread().getName() + "正在执行。。。");
        for(int i =0;i<5;i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程 " + Thread.currentThread().getName() + "开始执行...");
                    try {
                        Thread.sleep(1000);//将当前子线程睡1s
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("this is " + Thread.currentThread().getName() + "working");
                    countDownLatch.countDown(); //当前子线程执行完成后将计数器值减1
                }
            };
            executorService.execute(runnable);
        }
        try {
            countDownLatch.await(); //阻塞当前线程，直到计数器的值为0
            System.out.println("主线程 " + Thread.currentThread().getName() + "继续执行...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
