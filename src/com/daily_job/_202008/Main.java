package com.daily_job._202008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l1.add("1");
        l2.add(1);
        System.out.println(l1.get(0).getClass());
        System.out.println(l2.get(0).getClass());
        System.out.println(l1.getClass() == l2.getClass());
        Hashtable a = new Hashtable();
    }
}
