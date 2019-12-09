package algorithm.oneTo10;

import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class FoldNumSum {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191209
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        int sum = 0,b= 0;
        for(int i = 0;i<n;i++){
            b += a;
            sum +=  b;
            a *= 10;
        }
        System.out.println(sum);
    }
}
