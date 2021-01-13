package com.daily_job._202101._20210113;

import java.util.ArrayList;
import java.util.List;

/**
 * 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 则依次打印出数字：
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][4];
        arr[0] = new int[]{1, 2, 3, 4};
        arr[1] = new int[]{5, 6, 7, 8};
        arr[2] = new int[]{9, 10, 11, 12};
        arr[3] = new int[]{13, 14, 15, 16};
        arr[4] = new int[]{17, 18, 19, 20};
        printArray(arr);
    }
    public static void printArray(int[][] arr){
        List<Integer> list = new ArrayList();
        int row = arr.length-1;
        int col = arr[0].length-1;
        int i=0,j=0;
        while(i<=row && j<=col){
            for(int n=i;n<=col;n++){
                list.add(arr[i][n]);
            }
            for(int n=i+1;n<=row;n++){
                list.add(arr[n][col]);
            }

            for(int n=col-1;n>=j;n--){
                list.add(arr[row][n]);
            }
            for(int n=row-1;n>i;n--){
                list.add(arr[n][i]);
            }
            i++;
            j++;
            row--;
            col--;
        }
        System.out.println();
    }
}
