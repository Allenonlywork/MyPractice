package com.newCoder;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int[] arr = new int[n];
            TreeSet set = new TreeSet();
            for(int i =0;i < n;i++){
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }
            Iterator it =  set.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
