package com.myTest;

import java.util.Scanner;

public class TestReg {
    public static void main(String[] args) {
        String reg = "^[A-Za-z0-9\u4e00-\u9fa5]+(·)?[A-Za-z0-9\u4e00-\u9fa5]+$";
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String name = sc.nextLine();
            if(name.matches(reg)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}
