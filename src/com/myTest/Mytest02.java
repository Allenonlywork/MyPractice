package com.myTest;


import java.util.ArrayList;
import java.util.List;

public class Mytest02 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList();
        for(int i = 0;i<5;i++){
            Person p = new Person();
            list.add(p);
            p.setName("a" + i);

        }
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
