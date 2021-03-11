package com.daily_job._202101._20210122;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution1 {
    public static void main(String[] args) {
        byte[] b1 = new byte[0];
        Data data = new Data();
        Data data2 = new Data();
        new Thread(){
            @Override
            public void run(){
                data.print2(Thread.currentThread());
            };
        }.start();
        new Thread(){
            @Override
            public void run(){
                data2.print1(Thread.currentThread());
            };
        }.start();

    }
}
class Data{
    public static synchronized void print1(Thread thread){
        for(int i=0;i<50;i++){
            System.out.println(thread.getName() + ":" + i);
        }
    }

    public static synchronized void print2(Thread thread){
        for(int i=0;i<50;i++){
            System.out.println(thread.getName() + ":" + i);
        }
    }

}
