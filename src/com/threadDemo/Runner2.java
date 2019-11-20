package com.threadDemo;

public class Runner2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1;i<10;i++){
            System.out.println("这里执行的是Runner2:" + i);
        }

    }
}
