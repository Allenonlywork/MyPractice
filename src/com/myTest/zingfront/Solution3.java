package com.myTest.zingfront;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(",");
        int n = Integer.valueOf(strings[0]);
        int m = Integer.valueOf(strings[1]);
        System.out.println("可能的组合方式数有：" + getGroupNum(n,m) + "种");
    }

    /**
     * 获取可能的组合数
     * @param n 游戏币的个数
     * @param m 总面值
     * @return
     */
    public static int getGroupNum(int n,int m){
        //n,m不能小于0
        if(m<=0 || n<=0){
            return 0;
        }
        //组合方式数
        int sum = 0;
        //各种面值可能有的最大个数
        int one = m;
        int two = m/2;
        int five = m/5;
        int ten = m/10;

        //枚举所有的情况，当总币数等于n,总面值等于m时，总组合方式加1
        for(int i =0;i<=one;i++){
            for(int j = 0;j<=two;j++){
                for(int k = 0;k<=five;k++){
                    for(int l =0;l<=ten;l++){
                        if(((i+j+k+l)== n)&&((i + j*2 + k*5 + l*10) == m)){
                            sum++;
                        }
                    }
                }

            }
        }
        return sum;
    }
}
