package com.myTest.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * λ表达式由三部分组成：参数列表，箭头（->），以及一个表达式或语句块
 * λ表达式主要用于替换以前广泛使用的内部匿名类，各种回调，比如事件响应器、传入Thread类的Runnable等
 */
public class LambdaExpression {
    public static void main(String[] args) {
//        int tmp = (x,y)->{return x+y};
        //用于替换匿名内部类
       Thread thread = new Thread(()->{
           System.out.println("LambdaExpression");
       });
       thread.start();

       //用于集合类的批处理
        List<String> list = new ArrayList();
        for(String s : list){
            System.out.println(s);
        }
        list.forEach((s)->{
            System.out.println(s);
        });

    }
}
