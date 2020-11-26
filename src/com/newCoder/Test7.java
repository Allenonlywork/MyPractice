package com.newCoder;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        int i = 0;
        if(f+0.5<Math.ceil(f)){
            i=(int)Math.floor(f);
        }else{
            i = (int)Math.ceil(f);
        }

        System.out.println(i);
    }
}
