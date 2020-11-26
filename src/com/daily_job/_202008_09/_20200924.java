package com.daily_job._202008_09;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class _20200924 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        System.out.println(threadPoolExecutor.isShutdown());
        System.out.println(threadPoolExecutor);
        System.out.println(threadPoolExecutor.isTerminated());
        threadPoolExecutor.shutdown();
        System.out.println(threadPoolExecutor);
        System.out.println(threadPoolExecutor.isShutdown());
        System.out.println(threadPoolExecutor.isTerminated());
    }
}
