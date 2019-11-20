package com.sort;

public class quickSort {
    public static int division(int[] list,int left, int right){
        //以最左边的数[left]为基准
        int base = list[left];
        while(left < right){
            //从序列右端开始，向左遍历，直到找到小于base的数
            while(left < right && list[right]>=base){
                right--;
            }
            //从序列左端开始，向右遍历，直到找到大于base的数
            while(left<right && list[left]<=base){
                left++;
            }
            //找到了比base大的元素，将这个元素放到最右边的位置
            list[right] = list[left];
        }
        //最后将base放到left的位置，此时，left位置的左侧数值应该都比left小；
        //而left位置的右侧数值应该都比left大。
        list[left] = base;
        return left;
    }
    private static void quickSortFunction(int[] list, int left, int right){
        //左下标一定小于右下标，否则就越界了
        if(left < right){
            //对数组进行分割，去除下次分割的基准标号
            int base = division(list,left,right);

            System.out.format("base=%d:\t",list[base]);

            //对基准标号左侧的一组数值进行递归的切割，以至于将这些数值完整的排序
            quickSortFunction(list,left,base-1);
            //对基准标号左侧的一组数值进行递归的切割
            quickSortFunction(list,base+1,right);
        }
    }

    public static void main(String[] args) {
        int[] list = {'3','2','5','4','1'};
        quickSortFunction(list,0,list.length-1);
        for(int i = 0;i<list.length-1;i++){
            System.out.println(list[i]);
        }
    }
}

