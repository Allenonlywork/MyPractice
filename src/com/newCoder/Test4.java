package com.newCoder;

import java.util.Scanner;

/**
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();


    }
    public String getString(String s){


        if(s.length() == 8){
            return s;
        }else if (s.length() < 8){
            for(int i =0;i<8-s.length();i++){
                s = s + "0";
            }
            return s;
        }
        s.substring(0,8);
        return s;
    }
}
