package com.myTest.test;

public class MyThread2 implements Runnable {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    private volatile int i = 0;
    @Override
    public void run() {
        for(int n = 0;n<10;n++){
            threadLocal.set(i++);
            System.out.println(Thread.currentThread().getName() + "===n==" + threadLocal.get());
        }
    }
}
