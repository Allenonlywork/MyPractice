package algorithm.twentyTo30;

import java.util.Scanner;

/**
 * 求一个3*3矩阵对角线元素之和
 */
public class Test29 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20200214
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                a[i][j] = input.nextInt();
            }
        }
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("对角线之和为："+sum);
    }
}
