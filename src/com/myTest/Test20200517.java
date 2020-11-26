package com.myTest;
import java.util.Scanner;
public class Test20200517 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int n = 0;
            if(!"0".equals(s)){
                //电话号的数量
                n = Integer.valueOf(s);
                //电话号码数组
                String[] strings = new String[n];
                for(int i =0;i<n;i++){
                    strings[i] = sc.nextLine();
                }
                System.out.println(ifCanBeCall(strings));
            }
        }
        sc.close();
    }
    public static String ifCanBeCall(String[] strings){
        String re = "Yes";

        for(int i = 0;i<strings.length;i++){
            for(int j = 0;j< strings.length;j++){
                int n = strings[i].lastIndexOf(strings[j]);
                System.out.println("j在i中的下标为===="+n);
                if((i != j)&& (n == 0)){
                    re = "NO";
                }
            }
        }

        return re;

    }

}
