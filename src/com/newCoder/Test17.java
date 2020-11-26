package com.newCoder;

import java.util.Scanner;
import java.util.TreeSet;

public class Test17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet();
        while(sc.hasNext()) {
            int n = Integer.valueOf(sc.nextLine());
            for (int i = 0; i < n; i++) {
                int m = Integer.valueOf(sc.nextLine());
                set.add(m);
            }
            for(Integer i:set){
                System.out.println(i);
            }
        }
        }
}
