package com.myTest.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDate1 {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String formatDate = simpleDateFormat.format(date);
//        System.out.println(formatDate);
        String sdate = "2020-08-18T16:24:20";
//        String sdate2 = sdate.replaceAll("T"," ");
        Date sdate2 = simpleDateFormat.parse(sdate.replaceAll("T"," "));
        System.out.println(sdate2);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE,-1);
        Date d = calendar.getTime();
        System.out.println(d);
        if(d.before(sdate2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
//        String d2 = simpleDateFormat.format(d);
//        System.out.println(Long.valueOf(d2));
////        tranTime <= nowTime - 1min;
//
//        System.out.println(Integer.MAX_VALUE);
    }
}
