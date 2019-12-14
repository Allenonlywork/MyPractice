package algorithm.tenTo20;

import java.util.Scanner;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class CompareSize {
    /**
     * Author xieqiong
     * @param args
     * Version 1.0
     * DATE 20191211
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int t =0;
        if(x > y){
            t = x;
            x = y;
            y = t;
        }
        if(y > z){
            t = z;
            z = y;
            y = t;
        }
        if (x > y){
            t = x;
            x = y;
            y = t;
        }
        System.out.println(x + " " + y + " " + z);
    }
}
