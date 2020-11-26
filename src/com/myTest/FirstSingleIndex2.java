package com.myTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstSingleIndex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(getFirstSingleIndex(s));
        }
    }

    public static int getFirstSingleIndex(String s){
        //字符串转为字符数组
        char[] chars = s.toCharArray();
        //用一个数组来存储每个字符出现的次数
        int[] arr = new int[chars.length];
        for(int i = 0;i<chars.length;i++){
            int count = 1;
            for(int j =i+1;j<chars.length;j++){
                if(chars[j] == chars[i]){
                    count++;
                }
            }
        }
        return -1;
    }
}
