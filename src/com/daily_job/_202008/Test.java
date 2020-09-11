package com.daily_job._202008;

import java.util.ArrayList;
import java.util.Hashtable;

public class Test {

    public static void main(String[] args) {
        System.out.println(Test2.a);
    }

}
class Test2{
    public static final String a=new String("JDK");
    static {
        System.out.print("OK");
    }


}
