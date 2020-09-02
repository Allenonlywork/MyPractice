package com.myTest.zingfront;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("A",10);
        map.put("B",7);
        map.put("C",5);
        map.put("D",4);
        int n = 10*12;
        map = adjustForMonths(map,n);
        for(String s : map.keySet()){
            System.out.println("部门" + s + "的人数为：" + map.get(s));
        }
    }

    public static Map adjustForMonths(Map<String,Integer> map,int n){
        if(n<=0){
            return map;
        }
        //存在规律：每4个月各部门人数循环相等
        n = n%4;
        if(n == 0){
            n = 4;
        }
        for(int i =0;i<n;i++){
            //获取人数最多的部门编号
            String key = getMax(map);
            //人数最多的部门人数减3
            map.put(key,map.get(key) -3);
            //其他部门人数加1
            for(String s:map.keySet()){
                if(!key.equals(s)){
                    map.put(s,map.get(s) + 1);
                }
            }
        }
        return map;
    }

    public static String getMax(Map<String,Integer> map){
        int max =0;
        String maxString = "";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxString = entry.getKey();
            }
        }
        return maxString;
    }
}
