package com.daily_job._202008_09.hw;

import java.util.Scanner;

/**
 * 密码验证合格程序
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有相同长度大于2的子串重复
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            System.out.println(isQualifiedPwd(s));
        }
    }

    private static String isQualifiedPwd(String s) {
        String ng = "NG";
        String ok = "OK";
        int a = 0;//大写字母
        int b = 0;//小写字母
        int c = 0;//数字
        int d = 0;//其他字符
        if(s.length() <=8){
            return ng;
        }
        //判断是否包含大小写字母.数字.其它符号
        if(a+b+c+d < 3){
            return ng;
        }
        return ok;
    }
}
