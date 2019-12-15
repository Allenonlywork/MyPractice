package algorithm.twentyTo30;
/**
 * 题目：给一个不多于5位的正整数，
 * 要求：一、求它是几位数，二、逆序打印出各位数字。
 */

import java.util.Scanner;

public class Test24 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191215
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toString = input.nextLine();
        char[] num = toString.toCharArray();
        System.out.println(num.length);
        for(int i =num.length;i>0;i--){
            System.out.println(num[i-1]);
        }
    }
}
