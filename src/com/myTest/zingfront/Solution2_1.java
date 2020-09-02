package com.myTest.zingfront;

public class Solution2_1 {
    public static void main(String[] args) {
        String s = "abc13e4efe2rt3er";
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();

        System.out.println(isValidate(s));
    }

    public static String isValidate(String s){
        String flag = "error";
        char[] chars = s.toCharArray();

        int sum = getCharsSum(chars) + getDigitalSum(chars);
        if(sum % 10 == 0){
            flag = "OK";
        }
        return flag;
    }

    /**
     * 将字符转成数字
     * @param ch 输入字符
     * @return  返回对应的int数值
     */
    public static int getCharToDigital(char ch){
        int i = 0;
        if(ch >= 97){//小写字符转成从1-9的数字
            int temp = (ch -96)%9;
            if(temp == 0){
                temp = 9;
            }
            i = temp;
        }else if(0<=ch -48&&ch -48<=9){//数字字符转成数字
            i = ch -48;
        }
        return i;
    }

    /**
     * 从序列号最后⼀位字符开始，逆向将奇数位(1、3、5等等)相加
     * @param chs
     * @return
     */
    public static int getCharsSum(char[] chs){
        int odd_sum = 0;
        int temp =0;
        int index =1;
        for(int i = chs.length-1;i>=0;i--){
            if(chs[i]>=97){//找到倒数第一个字符的位置
                temp=i;
                break;
            }
        }

        for(int j = temp;j>=0;j--){//对字符数组从后往前遍历，索引下标为奇数时累加奇数和
            if(index%2 ==1){
                odd_sum +=getCharToDigital(chs[j]);
            }
            index++;
        }
        System.out.println("odd_sum:==="+odd_sum);
        return odd_sum;
    }

    /**
     * 、从序列号最后⼀位数字开始，逆向将偶数位数字，先乘以2（如果乘积为两位数，则将其减去 9），再求和；
     * @param chs
     * @return
     */
    public static int getDigitalSum(char[] chs){
        int even_sum = 0;
        int temp = 0;
        int index =1;

        for(int i = chs.length-1;i>=0;i--){
            if((chs[i]>=48)&&(chs[i]<=57)){//找到倒数第一个数字的位置
                temp=i;
                break;
            }
        }

        for(int j = temp;j>=0;j--){//对字符数组从后往前遍历
            if((chs[j]>=48)&&(chs[j]<=57)){//为数字时判断下标是否为偶数，并将下标加1
                if(index%2 == 0){
                    int k = getCharToDigital(chs[j])*2;//将偶数位数字乘以2
                    if(k>10){
                        k = k-9;
                    }
                    even_sum +=k;
                }
                index++;
            }

        }
        System.out.println("even_sum==="+even_sum);
        return even_sum;
    }
}
