package com.daily_job._202008_09._20200912p;

import java.util.Scanner;

/**
 * 题目描述：找出输入字符串中的重复字符，再根据ASCII码把重复的字符从小到大排序。
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[150];
        for(int i = 0;i< s.length();i++){
            arr[s.charAt(i)] ++;
        }
        for(int j =0;j<arr.length;j++){
            if(arr[j] > 1){
                System.out.print((char)j);
            }
        }
    }
}
