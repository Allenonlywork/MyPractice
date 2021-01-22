package com.daily_job._202101._20210121;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        Manage manage = new Manage("tom","15028596057");
        System.out.println(manage.getPhone().equals("15028596057"));
    }
}
