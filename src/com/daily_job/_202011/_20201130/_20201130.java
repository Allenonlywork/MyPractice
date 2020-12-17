package com.daily_job._202011._20201130;

import java.util.Scanner;

/**
 * 输入一个正整数num1，删除其中n位后最小的num1
 * 求num1
 */
public class _20201130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        int n = Integer.valueOf(sc.nextLine());
        int[] arr = new int[num1.length()];
        int[] minArr = new int[num1.length() -n];
        int min =0;
        for(int i = 0;i<num1.length();i++){
            arr[i] = Integer.valueOf(num1.charAt(i)+"");
            System.out.print(arr[i]);
        }
        int temp = 0;
        int times = num1.length() - n;
        for(int i = 0;i<times;i++){
            n--;
            min = arr[temp];
            for(int j = temp;j<(num1.length() - temp) - n - 1;j++){
                if(arr[j] < min){
                    min = arr[j];
                    temp = j + 1;
                }
            }
            minArr[i] = min;
        }
        System.out.println();
        for(int i : minArr){
            System.out.print(i);
        }
    }
}
