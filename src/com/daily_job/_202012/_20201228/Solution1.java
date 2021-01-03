package com.daily_job._202012._20201228;

import java.util.Scanner;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution1 {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count = 0;
            while (n != 0) {
                n = n & (n -1);
                count++;
            }
            System.out.println(count);
        }
    }
}
