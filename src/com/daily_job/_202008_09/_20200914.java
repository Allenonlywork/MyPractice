package com.daily_job._202008_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _20200914 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String newDate = simpleDateFormat.format(date);
        boolean flag = true;
        long start = System.currentTimeMillis();
        System.out.println("程序开始时间：" + start);
        for(int i =0 ;i < 365 * 10;i++){
            //用于比较的当前日期
            String nowDate = getNdayAfter(0,newDate);
            //当前日期1-7天前的日期
            String[] days = get7DaysBefore(nowDate);
            for(int j = 0 ;j < days.length ; j++){
                for(int n = 1;n < 25;n++){
                    String b = "B" + days[j] + getSerialNo(n);
                    for(int k = 1;k < 25;k++){
                        String a = "B" + nowDate + getSerialNo(n);
                        int m = j+ 1;
//                        System.out.println("nowDate String: " + a + "*****   " + m + "days before String: " + b);
                        if(b.compareTo(a) >= 0){
                            flag = false;
                            System.out.println("false");
                        }
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("程序结束时间：" + end);
        System.out.println("耗时：" + (end - start) + "ms");
        if(flag){
            System.out.println("bingo!!!");
        }else {
            System.out.println("***************ggg");
        }
    }

    //获取4位序列号
    public static String getSerialNo(int n){
       return String.format("%0" + 4 + "d",n);
    }

    //获取指定天数后的日期
    public static String getNdayAfter(int n,String date) throws ParseException {
        return subDay(-n,date);
    }

    //获取指定日期的前7天的所有日期8位字符串
    public static String[] get7DaysBefore(String nowDate) throws ParseException {
        String[] strings = new String[7];
        strings[0] = subDay(1,nowDate);
//        System.out.println("1 day before : " + strings[0]);
        strings[1] = subDay(2,nowDate);
//        System.out.println("2 day before : " + strings[1]);
        strings[2] = subDay(3,nowDate);
//        System.out.println("3 day before : " + strings[2]);
        strings[3] = subDay(4,nowDate);
//        System.out.println("4 day before : " + strings[3]);
        strings[4] = subDay(5,nowDate);
//        System.out.println("5 day before : " + strings[4]);
        strings[5] = subDay(6,nowDate);
//        System.out.println("6 day before : " + strings[5]);
        strings[6] = subDay(7,nowDate);
//        System.out.println("7 day before : " + strings[6]);
        return strings;
    }

    //获取指定日期的num天前 或后（num为负数）的8位字符串
    public static String subDay(int num,String newDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date  currdate = format.parse(newDate);
        Calendar ca = Calendar.getInstance();
        ca.setTime(currdate);
        ca.add(Calendar.DATE,-num);// num为减少的天数，可以改变的
        currdate = ca.getTime();
        String enddate = format.format(currdate);
        return enddate;
    }
}
