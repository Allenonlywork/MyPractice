package com.newCoder;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long l = sc.nextLong();
        if(l<2){
            System.out.println(l+ " ");
        }else{
            getResult(l);
        }

        sc.close();
    }
    public static void getResult(long ulDataInput){
        for(int i =2;i<=ulDataInput;i++) {
            while (ulDataInput % i == 0) {
                ulDataInput = ulDataInput / i;
                System.out.print(i + " ");
            }
        }

    }
}
