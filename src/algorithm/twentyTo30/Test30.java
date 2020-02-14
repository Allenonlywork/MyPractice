package algorithm.twentyTo30;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 */
public class Test30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        for(int i =0;i<10;i++){
        }
        //快速排序
        Arrays.sort(a);
        for(int i =0;i<10;i++){
            System.out.println(a[i]);
        }
        int x = input.nextInt();
        a = sort(a,x);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    private static int[] sort(int[] a, int x) {
        int[] c = new int[a.length+1];
        boolean flag = true;
        for(int i =0;i<a.length;i++){
            if(flag){
                if(a[i] < x){
                    c[i] = a[i];
                }else{
                    c[i] = x;
                    flag = false;
                    System.arraycopy(a,i,c,i+1,a.length-i);
                }
            }else{
                break;
            }
        }
        return c;
    }

}
