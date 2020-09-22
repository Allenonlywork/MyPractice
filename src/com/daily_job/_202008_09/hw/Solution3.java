package com.daily_job._202008_09.hw;

/**
 * 找出字符串中出现次数最多的字母和出现的次数
 */
public class Solution3 {
    public static void main(String[] args) {
        String s = "sheepmusheepmummmm";
        int[] arr = new int[200];
        for(int i =0 ;i< s.length();i++){
            arr[s.charAt(i)]++;
        }
        int max = 0;
        char c = ' ';
        for(int j = 0;j<arr.length;j++){
            if(arr[j] != 0){
                if(arr[j] > max){
                    max = arr[j];
                    c = (char) j;
                }
            }
        }
        System.out.println("出现次数最多的字符是：" + c + "，出现的次数为：" + max);
    }
}
