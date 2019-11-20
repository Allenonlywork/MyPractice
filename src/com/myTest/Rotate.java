package com.myTest;

public class Rotate {
    public static void rotate(int[] nums, int k) {
        if (k % nums.length != 0) {
            int pre, tem;
            for (int i=0; i < k % nums.length; i++) {
                pre = nums[nums.length-1];
                for (int j=0; j<nums.length; j++) {
                    tem = nums[j];
                    nums[j] = pre;
                    pre = tem;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int nums[] = {1,2,3,4,5,6,7};
//        rotate(nums,3);
//        for(int i =0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
        String s = "qwertyuiop";
        char[] dst = {'a','b','c','d'};
        s.getChars(1,3,dst,2);
        System.out.println(dst);
    }
}
