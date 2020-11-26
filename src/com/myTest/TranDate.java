package com.myTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TranDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        System.out.println(dateFormat.format(new Date()));


    }
}
