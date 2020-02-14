package algorithm.twentyTo30;

import java.util.Scanner;

/**
 * 对10个数进行排序
 */
public class Test28 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20200214
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[10];
        for(int i = 0;i<10;i++){
            intArray[i] = input.nextInt();
        }
        int[] b = sort(intArray);
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
//冒泡排序 （升序）
    private static int[] sort(int[] intArray) {
        for(int i = 0;i<intArray.length;i++){
            for(int j = i;j<intArray.length;j++){
                if(intArray[i]>intArray[j]){
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }
}
