package com.solutions.s60_70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 成绩排序
 */
public class Solution68 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str;
            while((str=reader.readLine())!=null){
                //获取要排序的人的个数
                int count = Integer.parseInt(str);
                //获取输入的排序方法(升序还是降序),0为降序，1为升序
                int sortType = Integer.parseInt(reader.readLine());
                // 姓名和分数
                String[] users = new String[count];
                int[] scores = new int[count];

                // 遍历每一个人
                for(int i=0;i<count;i++){
                    String line = reader.readLine();
                    String[] parts = line.split(" ");  // 第i个人姓名加分数
                    String user = parts[0];   // 分离出第i个人的姓名
                    int score = Integer.parseInt(parts[1]);  // 分离出第i个人的分数
                    if(sortType==0){       // 降序情况
                        int j = 0;
                        for(j=i-1;j>=0;j--){
                            if(scores[j]<score){   //i前面一个人j的分数如果小于第i个人，则第j往后排一位，循环完后，j值减1
                                scores[j+1] = scores[j];
                                users[j+1] = users[j];
                            }
                            else{
                                break;
                            }
                        }
                        //j+1的位置就是i要插入的位置
                        scores[j+1] = score;
                        users[j+1] = user;
                    }
                    else{
                        int j = 0;
                        for(j=i-1;j>=0;j--){
                            if(scores[j]>score){
                                scores[j+1] = scores[j];
                                users[j+1] = users[j];
                            }
                            else{
                                break;
                            }
                        }
                        scores[j+1] = score;
                        users[j+1] = user;
                    }
                }
                for(int i=0;i<count;i++){
                    System.out.println(users[i]+" "+scores[i]);
                }
            }
        } catch(IOException e){
        }
    }
}
