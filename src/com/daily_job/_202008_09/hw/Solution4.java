package com.daily_job._202008_09.hw;

import java.util.*;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(getReverseUnRepeatInt(a));
    }
    public static int getReverseUnRepeatInt(int a){
        String s = String.valueOf(a);
        s = reverse(s); //反转字符串
        System.out.println("反转后s= " + s);
        s = getUnrepeat(s); //去重
        System.out.println("去重后s= " + s);
        return Integer.valueOf(s);
    }
    public static String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        return new String(sb.reverse());
    }
    public static String getUnrepeat(String s){
        StringBuffer sb = new StringBuffer();
        List<Character> list = new LinkedList<>();
        for(int i = 0;i < s.length();i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        for(char c : list){
            sb.append(c);
        }
        return new String(sb);
    }
}
