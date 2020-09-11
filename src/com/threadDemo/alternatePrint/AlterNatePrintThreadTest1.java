package com.threadDemo.alternatePrint;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 两个线程实现交替打印
 *
 */
public class AlterNatePrintThreadTest1 {
    private static final Integer n =11;
    private static volatile boolean flag = true;
    private static AtomicInteger num = new AtomicInteger();
    public static void main(String[] args) {
        num.getAndIncrement();
        Thread jsThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(num.get() <= n -1){
                    if(flag){
                        System.out.println("输出奇数: " + num.getAndIncrement());
                        flag = false;
                    }
                }
            }
        });
        Thread osThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(num.get() <= n -1){
                    if(!flag){
                        System.out.println("输出偶数: " + num.getAndIncrement());
                        flag = true;
                    }
                }
            }
        });
        jsThread.start();
        osThread.start();
    }
}
