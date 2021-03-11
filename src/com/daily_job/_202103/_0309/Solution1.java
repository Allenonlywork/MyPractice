package com.daily_job._202103._0309;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0][1]);
        List list = new ArrayList();
//        list.stream().sorted(Comparator).map().collect()

    }

    public static int test(){
        return 1;
    }

    @Test
    public void test1(){
        Runnable test = Solution1::test;
    }
}
