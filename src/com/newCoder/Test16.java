package com.newCoder;

import java.util.Scanner;

public class Test16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.valueOf(sc.nextLine());
            System.out.println(getNum(n));
        }
    }
    public static int getNum(int n){
        if(n < 2){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int sum = 0;
        //三个空瓶子可以兑换一瓶汽水，m表示可以兑换的汽水瓶数
        int m = n/3;
        //k表示兑换后剩余的空瓶子数量
        int k = n%3;
        sum = m + getNum(m+k);
        return sum;
    }
}
