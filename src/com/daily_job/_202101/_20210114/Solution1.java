package com.daily_job._202101._20210114;

import java.util.Stack;

/**
 * 带min接口的栈
 */
public class Solution1 {
    public static Stack<Integer> stack = new Stack<>();
    public static int min=Integer.MIN_VALUE;
    public static void main(String[] args) {
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        System.out.println(min());
    }
    public static int pop(){
        int temp = stack.pop();
        if (temp == min) {
            min = stack.pop();
        }
        return temp;
    }
    public static void push(int a){
        if(a<min){
            min = a;
            stack.push(min);
        }
        stack.push(a);
    }
    public static int min(){
        return min;
    }
}
