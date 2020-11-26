package com.myTest.test;

public class t20200727 {
    public static void main(String[] args) {
        MyThread2 mythread = new MyThread2();
        Thread t1 = new Thread(mythread);
        t1.setName("线程1");
        Thread t2 = new Thread(mythread);
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
