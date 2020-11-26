package com.newCoder;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] arr = new String[s.length()];
            for(int j = 0;j<arr.length;j++){
                arr[j] = s.substring(j,j+1);
            }
            for(int j = arr.length-1;j>=0;j--){
                System.out.print(arr[j]);
            }
        }
    }


}
