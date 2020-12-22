package com.daily_job._202012._20201222;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 比如n=3时，2*3的矩形块有3种覆盖方法
 * f(n) = f(n-1) + f(n-2)
 * f(0) = 1;
 * f(1) = 1;
 * f(2) = 2;
 */
public class Solution1 {
    //非递归解法
    public static void main(String[] args) {
        int n = 6;
        System.out.println(RectCover(n));
    }

    private static int RectCover(int n) {
        if(n < 0) return  0;
        return RectCover1(n-1) + RectCover1(n-2);
    }

    private static int RectCover1(int n) {
        if(n <= 2) return n;
        int f =1,g=2;
        //1,2,3,5,8,13...
        //g,f 往后移动
        while(n>1){
            g = f + g;
            f = g - f;
            n--;
        }
        return f;
    }
}
