package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDate {
    /**
     16      * 指定日期加上天数后的日期
     17      * @param num 为增加的天数
     18      * @param newDate 创建时间
     19      * @return
     20      * @throws ParseException
     21      */
    public static String plusDay(int num,String newDate) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date  currdate = format.parse(newDate);
        System.out.println("现在的日期是：" + currdate);
        Calendar ca = Calendar.getInstance();
        ca.setTime(currdate);
        ca.add(Calendar.DATE, num);// num为增加的天数，可以改变的
        currdate = ca.getTime();
        String enddate = format.format(currdate);
        System.out.println("增加天数以后的日期：" + enddate);
        return enddate;
    }

    public static void main(String[] args) throws ParseException {
        String date = "20200729";
        String date2 = "20200730";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date tranDate = format.parse(date);
        plusDay(8,date);
    }
}
