package algorithm.oneTo10;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 利用三目运算符实现成绩分级别展示
 */
public class Classification {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191206
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        char grade = score>=90?'A':score>=60?'B':'C';
        System.out.println(grade);
    }
}
