package com.daily_job._202102;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int N = 5;
        int[] A = {2,2,1,2};
        int[] B = {1,3,4,4};
        solution(N,A,B);
    }
    public static int solution(int N, int[] A, int[] B) {
        // write your code in Java SE 8
        int k = A.length;
        int res = 0;
        int[][] arr = new int[k][2];
        for(int i = 0;i<k;i++){
            arr[i][0] = A[i];
            arr[i][1] = B[i];
        }
        Map<Integer,Integer> map = new TreeMap();
        for(int i =0;i<k;i++){
            for(int j=0;j<2;j++){
                if(!map.containsKey(arr[i][j])){
                    map.put(arr[i][j],1);
                }else{
                    map.put(arr[i][j],map.get(arr[i][j])+1);
                }
            }
        }
        //int temp = N-map.size();
        int[] temp = new int[map.size()];
        int m =0;
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for(Map.Entry entry:set){
            temp[m] = (int)entry.getValue();
            m++;
        }
        Arrays.sort(temp);//asc
        while(m>0){
            res+=N*temp[m-1];
            N--;
            m--;
        }
        return res;
    }
}
