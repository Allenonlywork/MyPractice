package com.daily_job._202101._20210106;

/**
 * 小数的整数次方
 * 1、小数可能是正或负小数
 * 2、整数次方可能是正或负整数
 */
public class Solution1 {
    public static void main(String[] args) {
        double base = 0.12;
        int exp = -12;

    }
    public static double power(double base,int exp){
        boolean flag = exp>0;//指数是否为正数
        exp = exp < 0 ? -exp : exp;//取指数的绝对值
        double res = 1;//返回结果
        while(exp!=0){//指数不为0
            if((exp&1) == 1){//指数不为0
                res *= base;//返回结果乘以底数
            }
            base*=base;//底数平方
            exp>>=1;//指数右移一位 除以2
        }

        return flag?res:1/res;
    }
}
