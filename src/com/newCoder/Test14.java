package com.newCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.valueOf(s);
       /* TreeSet<String> set = new TreeSet<>();
        for(int i =0;i < n;i++){
            String str = sc.nextLine();
            set.add(str);
        }
        for(String str : set){
            System.out.println(str);
        }*/
        ArrayList<String> set = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            set.add(str);
        }
        Collections.sort(set);
        for(String string : set){
            System.out.println(string);
        }
    }
}
