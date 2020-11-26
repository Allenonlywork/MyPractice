package com.myTest;

import java.util.Scanner;

public class FirstSingleIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(getFirstSingleIndex(s));
        }
    }
//获取第一个不重复字符的下标
    public static int getFirstSingleIndex(String s){
        char[] chars = s.toCharArray();
        for(int i = 0;i<chars.length-1;i++){
            for(int j = i+1;j<chars.length;j++){
                if(chars[j] == chars[i]){
                    /**
                     * 当找到相同字符
                     * 1、
                     * 2、
                     */
                    if(i+1 == chars.length -1){
                        return chars.length -1;
                    }
                    break;
                }else{//未找到相同字符直接返回下标i
                 return i;
                }
            }
        }
        //没找到不重复的字符则输出-1
        return -1;
    }

}
