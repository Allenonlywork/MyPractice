package com.daily_job._202008_09;

import java.util.Scanner;

/**
 * 找终点
 */
public class _20200911 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String string = sc.nextLine();
        String[] strings = string.split(" ");
        int[] arr = new int[strings.length];
        for(int i=0;i<strings.length;i++){
            arr[i] = Integer.valueOf(strings[i]);
        }

        System.out.println(findFinish(arr));
    }
    private static int findFinish(int[] arr){
        int length = arr.length;
        int min = 100;
        System.out.println(length);
        for(int i =1;i<length/2;++i){
            int path = 0;
            for(int j = i;j< length;j+= arr[j]){
                ++path;
                System.out.println("i==:"+i);
                System.out.println("path:"+path);
                System.out.println("j=====:"+j);
                if(j == length -1){
                    min = (min<(path)) ? min : path;
                    break;
                }
            }
        }
        if(min == 100){
            return -1;
        }
        return min;
    }
}
