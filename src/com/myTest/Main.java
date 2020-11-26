package com.myTest;

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s= sc.nextLine();
            char[] c = s.toCharArray();

            TreeSet<Character> set = new TreeSet();
            for(int i = 0;i<c.length;i++){
                set.add(c[i]);
            }
            int[] arr = new int[set.size()];

            int temp = 0;
            for(Character ch:set){
                for(int i = 0;i<c.length;i++){
                    if(c[i] == ch){
                        arr[temp]++;
                    }
                }
                temp++;
            }

            TreeMap<Character,Integer> map = new TreeMap(){};
            int m = 0;
            for(Character ch:set){
                for(int n = 0;n<arr[m];n++){
                    map.put(ch,arr[m]);
//                    System.out.print(ch);
                }
                m++;
            }
            for(int i =0;i<set.size();i++){
                int max = 0;
                Character temp2 = 'a';
                for(Character ch:map.keySet()){
                    if(map.get(ch)>max){
                        max = map.get(ch);
                        temp2 = ch;
                    }
                }
                for(int j = 0;j<max;j++){
                    System.out.print(temp2);
                }
                map.remove(temp2);
            }
        }
    }
}
