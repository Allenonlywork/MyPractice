package com.threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class RunnerExcute {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread t1 = new Thread(new Runner1());
//        Thread t2 = new Thread(new Runner2());
//
//        t1.start();
//        t2.start();

        FutureTask futureTask = new FutureTask(new CallThread());
        Thread thread = new Thread(futureTask);
        //返回值应该在执行完start Callable 接口的call方法之后才能获取到，否则一直等待
//        Object o1 = futureTask.get();
//        System.out.println(o1);
        thread.start();
        Object o = futureTask.get();
        System.out.println(o);
    }
}
class CallThread implements Callable{

    @Override
    public Object call() throws Exception {
        String s = "这里是一个call方法";
        System.out.println("zzz");
        return s;
    }
}
