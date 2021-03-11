package com.daily_job._202102;
//391257486
//升序快排
public class _20210203 {
    public static void main(String[] args) {
        int[] arr = {3,9,1,2,5,7,4,8,6};
//        bubbleSort(arr);//冒泡排序
        qucikSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void qucikSort(int[] arr,int low,int high){
        if(low < high){
            int index = getIndex(arr,low,high);
            qucikSort(arr,low,index-1);
            qucikSort(arr,index+1,high);
        }
    }
    public static int getIndex(int[] arr,int low,int high){
        int temp = arr[low];
        while(low<high){
            while(low<high && arr[high]>=temp){
                high--;
            }
            arr[low] = arr[high];
            while(low<high && arr[low]<=temp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
