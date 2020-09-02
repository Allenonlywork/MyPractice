package com.myTest.zingfront;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        String s = "abc13e4efe2rt3er";
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();

        System.out.println(isValidate(s));
    }

    public static String isValidate(String s){
        String flag = "error";
        char[] chars = s.toCharArray();

        int digital_num = getDigitalNum(chars);//邀请码中含有数字的个数

        System.out.println("digital_num+++"+digital_num);
        int[] digitals = new int[digital_num];//用于存放数字
        int[] chs = new int[16-digital_num];//用于存放字符的数字值
        int m=0;
        int k=0;
        //遍历邀请码字符数组，对字符和数字进行分类
        for(int i =0;i<chars.length;i++){
            if(chars[i] >= 97){//如果为小写字母则转为对应的数字值存入chs数组
                int temp = (chars[i] -96)%9;
                if(temp == 0){
                    temp = 9;
                }
                chs[m] = temp;
                m++;
            }else{//如果为数字则转为对应的int值传入digitals数组
                digitals[k] = chars[i] -48;
                System.out.println(digitals[k]);
                k++;
            }
        }

        int chars_sum = getCharsSum(chs);//字符求和
        int digital_sum = getDigitalSum(digitals);//数字求和
        if((chars_sum + digital_sum)%10 == 0){
            flag = "OK";
        }
        return flag;
    }

    /**
     * 从序列列号最后⼀一位字符开始，逆向将奇数位(1、3、5等等)相加
     * @param chs
     * @return
     */
    public static int getCharsSum(int[] chs){
        int chars_sum = 0;

        return chars_sum;
    }

    /**
     * 、从序列列号最后⼀一位数字开始，逆向将偶数位数字，先乘以2（如果乘积为两位数，则将其减去 9），再求和；
     * @param digitals
     * @return
     */
    public static int getDigitalSum(int[] digitals){
        int digital_sum = 0;

        return digital_sum;
    }
    /**
     * 获取字符数组中含有数字的个数
     * @param chars
     * @return
     */
    public static int getDigitalNum(char[] chars){
        int num =0;
        for(int i =0;i<chars.length;i++){
            if(0<=chars[i] -48&&chars[i] -48<=9){
                num++;
            }
        }
        return  num;
    }


}
