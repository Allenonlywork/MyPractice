package com.redis_call;

import redis.clients.jedis.Jedis;

public class RedisJava {

    public static void main(String[] args) {
        //连接远程服务器的 Redis 服务
        //服务器到期停用了 oh my god
        Jedis jedis = new Jedis("106.54.78.122");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        //分割线
        System.out.println("==========================");
        //获取k1
        System.out.println("获取k1的值为： "+jedis.get("k1"));
    }
}
