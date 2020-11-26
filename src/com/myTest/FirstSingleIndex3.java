package com.myTest;

import java.util.Scanner;

public class FirstSingleIndex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(getFirstSingleIndex(s));
        }
        sc.close();
    }
    public static int getFirstSingleIndex(String s){
        //字符串转为字符数组
        char[] chars = s.toCharArray();
        //创建一个数组用于存储字符出现的次数
        int[] arr = new int[chars.length];
        for (int i =0;i<chars.length;i++){
            int count =0;
            for(int j = 0;j<chars.length;j++){
                if((chars[j] == chars[i])){
                    count++;
                }
            }
            arr[i] = count;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                return i;
            }
        }
        return -1;
    }
}
