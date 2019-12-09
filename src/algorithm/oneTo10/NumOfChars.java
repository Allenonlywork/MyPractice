package algorithm.oneTo10;
/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */

import java.util.Scanner;

public class NumOfChars {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191209
     */
    public static void main(String[] args) {
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        Scanner input = new Scanner(System.in);
        String next = input.nextLine();
        char[] chars = next.toCharArray();
        for(int i = 0;i<chars.length;i++){
            if(Character.isLetter(chars[i])){
                abcCount++;
            }else if(Character.isDigit(chars[i])){
                numCount++;
            }else if(Character.isSpaceChar(chars[i])){
                spaceCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("abcCount:"+abcCount+ "\n" +
                "numCount:" + numCount + "\n" +
                "spaceCount:" + spaceCount + "\n" +
                "otherCount:" + otherCount
        );
    }
}
