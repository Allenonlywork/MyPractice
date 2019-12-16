package algorithm.twentyTo30;

import java.util.Scanner;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Test25 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191216
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        if(n<0||n!=0 && n%10 == 0)
            return false;
        int ver = 0;
        while(n > ver){
            ver = ver * 10 + n % 10;
            n = n / 10;
        }
        return (n == ver || n == ver/10);
    }
}
