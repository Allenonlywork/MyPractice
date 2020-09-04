package com.threadDemo.CountDownTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 所有子线程等待执行指令后同步执行
 */
public class CountDownLatchTest2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch1 = new CountDownLatch(5);

        for(int i = 0;i < 5;i++){
            Runnable runnable = () ->{
                try {
                    System.out.println("线程 " + Thread.currentThread().getName() + "准备执行...");
                    countDownLatch.await();//挂起当前子线程
                    long start = System.currentTimeMillis();
                    System.out.println("线程 " + Thread.currentThread().getName() + "开始执行...");
                    Thread.sleep(500);
                    System.out.println("线程 " + Thread.currentThread().getName() + "执行结束");
                    long end = System.currentTimeMillis();
                    System.out.println("线程 " + Thread.currentThread().getName() + "执行用时：" + (end -start));
                    countDownLatch1.countDown();//子线程计数器 -1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        executorService.execute(runnable);
        }
        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + ": 所有选手请就绪，准备发令...");
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName() + ": 开始...");
            countDownLatch1.await();//挂起当前线程
            System.out.println("所有子线程执行完毕！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
