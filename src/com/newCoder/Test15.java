package com.newCoder;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int i = 0;
        while(n > 0){
            if(n%2 == 1){
                i++;
            }
            n = n>>1;
        }
        System.out.println(i);
    }
}
