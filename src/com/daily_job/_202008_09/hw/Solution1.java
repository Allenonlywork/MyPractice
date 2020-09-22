package com.daily_job._202008_09.hw;

import java.util.Scanner;

/**
 * 输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。从后向前比较，以最短字符串为标准，
 *      输出不同的元素的个数。
 *            例如:  输入：s1="1,3,5"   len1=3        s2="2,4,1,7,5"   len2=5
 *             输出：1
 */
public class Solution1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String s1 = "1,3,5";
        int len1 = 3;
        String s2 = "2,4,1,7,5";
        int len2 = 5;
        System.out.println(getDiffNum(s1,len1,s2,len2));
    }

    private static int getDiffNum(String s1,int len1,String s2,int len2){
        String[] strs1 = s1.split(",");
        String[] strs2 = s2.split(",");
        int count = 0;
        int len = len1 > len2 ? len2 : len1;
        for(int i = 0 ;i < len; i++){
            if(!strs1[len1 - 1 - i].equals(strs2[len2 -1 -i])){
                count++;
            }
        }
        return count;
    }
}
