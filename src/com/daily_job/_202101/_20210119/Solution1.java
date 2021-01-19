package com.daily_job._202101._20210119;

import java.util.Stack;

/**
 *栈的压入弹出序列
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        System.out.println(isPopOrder(pushA,popA));
    }

    /**
     * 判断出栈序列popA是否可以为入栈序列pushA的正确出栈序列
     * @param pushA 入栈序列
     * @param popA  出栈序列
     * @return
     */
    public static boolean isPopOrder(int[] pushA,int[] popA){
        int pushIndex = 0;
        int popIndex = 0;
        //辅助栈
        Stack<Integer> stack = new Stack<>();
        //将入栈序列压入辅助栈
        while(pushIndex<pushA.length && popIndex<popA.length){
            stack.push(pushA[pushIndex++]);
            //
            while(popIndex<popA.length && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }
}
