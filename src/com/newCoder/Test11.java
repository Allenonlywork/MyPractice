package com.newCoder;

import java.util.Scanner;

public class Test11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = String.valueOf(i);
        int[] arr = new int[s.length()];
        for(int j = 0;j<arr.length;j++){
            arr[j] = Integer.valueOf(s.substring(j,j+1));
        }
        for(int j = arr.length-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
