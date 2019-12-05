package com.myTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * 测试map中put相同的key时，value是否会被覆盖
 */
public class TestSameKey {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191205
     */
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a","abc");
        map.put("a","bcd");

        System.out.println(map.get("a"));
    }
}
