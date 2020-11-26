package com.myTest.test;

import java.util.*;

public class t20200722 {
    public static void main(String[] args) {
        for (int i =0;i<5;i++){
//            System.out.println("====" + i);
            for(int j = 0;j<3;j++){
//                System.out.println("zzzzzzz" + j);
                if(j == 1){
//                    System.out.println("........."+j);
                    break;
                }

            }
        }

        List<String> list = new ArrayList<>();
        list.add("B20200001");
        list.add("B20200003");
        list.add("B20200002");
        list.add("B20200004");
        Map<String,Integer> map = new TreeMap<>();
        for(int i =0; i<list.size();i++){
            map.put(list.get(i),i+1);
        }
//        Iterator<Map.Entry<String, String>> entry = map.entrySet().iterator();
//        Map.Entry<String,String> entry1 = entry.next();
//       System.out.println("map.get1" +map.get(1));
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
