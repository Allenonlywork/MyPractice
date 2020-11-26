package com.myTest.test;

/**
 * 实现两个线程交替打印
 * 采用加锁的方式
 * wait，notify 线程通信机制
 */
public class MyThread implements Runnable{
    int n = 0;
    @Override
    public void run() {
        synchronized (this){
            while(true){
                notify();
                if(n<10){
                    System.out.println(Thread.currentThread().getName() + "=== n :" + n++);
                }else{
                    break;
                }
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
