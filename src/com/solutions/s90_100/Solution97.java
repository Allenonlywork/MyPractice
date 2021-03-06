package com.solutions.s90_100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 记负均正
 *
 * 首先输入要输入的整数个数n，然后输入n个整数。
 * 输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。
 */
public class Solution97 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line=br.readLine())!=null){
            int N = Integer.parseInt(line);
            int negativeCount=0;
            int positiveCount=0;
            int positiveSum = 0;
            String[] strs = br.readLine().split(" ");
            for(int i=0;i<strs.length;++i){
                int temp = Integer.parseInt(strs[i]);
                if(temp > 0){
                    ++positiveCount;
                    positiveSum += temp;
                }
                else if(temp < 0)
                    ++negativeCount;
            }
            System.out.printf("%d %.1f\n",negativeCount,positiveSum*1.0/positiveCount);
        }

    }
}
