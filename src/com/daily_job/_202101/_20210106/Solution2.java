package com.daily_job._202101._20210106;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] arr = {1,8,7,5,3,6,9,12};
        sort1(arr);//时间复杂度 O(n)
        for(int i : arr){
            System.out.print(i + ",");
        }
    }
    public static void sort1(int[] arr){
        int len = arr.length;
        int[] res = new int[len];
        int oddCount = 0;//奇数个数
        for(int i =0;i<len;i++){
            if((arr[i] % 2) != 0){//奇数
                oddCount++;
            }
        }
        int enenStart = oddCount;//偶数起始位置;
        int oddStart = 0;//奇数起始位置
        for(int j=0;j<len;j++){
            if((arr[j] % 2)!=0){//奇数
                res[oddStart] = arr[j];
                oddStart++;
            }else{//偶数
                res[enenStart] = arr[j];
                enenStart++;
            }
        }
        for(int k=0;k<len;k++){//res数组的值赋值给arr数组指向的位置
            arr[k] = res[k];
        }
    }
}
