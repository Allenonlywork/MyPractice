package com.daily_job._202007;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask {
    public static int i =0;
    public static void timer1(){
        Timer timer1 = new Timer();
        TimerTask timerTask1 =new TimerTask() {
            @Override
            public void run() {
                System.out.println(getNum());
            }
        };
        timer1.schedule(timerTask1
        ,1000,1000);
    }

    public static int getNum(){
        i++;
        return i;

    }
    public static void main(String[] args) {
        timer1();
    }
}

