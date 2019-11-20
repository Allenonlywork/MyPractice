package com.myTest;

import java.util.Scanner;

public class NumberOfOneBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while(flag == 1){
            System.out.println("请输入一个无符号整数：");
            int n = sc.nextInt();
            int count = 0;
            for(int i = 0;i<32;i++){
                if((n&1)==1){
                    count++;
                }
                n>>=1;
            }
            System.out.println(count);
            System.out.println("是否继续？请输入0终止，1继续");
            flag = sc.nextInt();
        }

    }
}
