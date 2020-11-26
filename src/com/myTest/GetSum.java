package com.myTest;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] str = s.split(" ");
            sum+= Double.valueOf(str[0]) * Double.valueOf(str[1]);

            System.out.println(sum);
        }


    }
}
