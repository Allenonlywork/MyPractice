package com.daily_job._202102;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        int[] A = {7, 3, 7, 3, 1, 3, 4, 1};
        solution(A);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int min = len;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<len;i++){
            map.put(A[i],0);
        }
        int n = map.size();// the number of different locations
        int temp =0;
        map.clear();
        for(int j=0;j<len-n+1;j++){
            for(int k =j;k<len;k++){
                map.put(A[k],0);
                if(n == map.size()){
                    temp = k-j;
                    break;
                }
            }
            map.clear();
            min = temp<min?temp:min;
        }

        return min;
    }
}
