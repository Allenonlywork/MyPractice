package com.daily_job._202008;

import java.util.Scanner;

/**
 * q求最大括号深度
 */
public class _20200910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String left = "(";
        String right = ")";
        int max = 0;
        int temp = 0;
        for(int i =0 ;i<s.length();i++){
            String a = String.valueOf(s.charAt(i));
            if(a.equals(left)){
                temp++;
            }else {
                temp--;
            }
            if(temp > max){
                max = temp;
            }
        }
        System.out.println(max);

    }
}
