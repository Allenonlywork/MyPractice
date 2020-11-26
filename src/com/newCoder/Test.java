package com.newCoder;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
//        String s = "asdfghjjkqw";
//        String s2 = s.substring(0,8);
//        System.out.println(s);
//        System.out.println(s2);
//        System.out.println(s.substring(2));
//        String s = "0x A";
//        System.out.println(s.indexOf(' '));
//        s= s.substring(2,s.length());
//        System.out.println(s);
////        System.out.println(Long.parseLong("0XA",16));
//
//        Map<Integer,String> map = new TreeMap<>();
//        map.put(1,"a");
//        map.put(3,"b");
//        map.put(2,"c");
//
////        Iterator it = map.it
//
//        for(String str:map.values()){
//            System.out.println(str);
//        }
//        System.out.println(5/3);
//        System.out.println(5%3);

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(3);
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
