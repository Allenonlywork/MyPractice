package com.file_ioStream;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        InputStream in = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        {
            try {
                in = new FileInputStream(file);
                /**
                 * 以字节输入流读取文件中的一个字节
                 * 输出字节
                 */
                //int i = in.read();
                //System.out.println(i);
                /**
                 * 以字节输入流读取多个字节
                 * 以字符形式输出
                 */
               /* byte[] buffer = new byte[10];
                in.read(buffer);
                System.out.println(new String(buffer));*/
                /**
                 * 1、将字节输入流转换成字符输入流
                 * 2、将字符输入流转换成字符缓冲流
                 * 3、读取字符缓冲流中的数据（返回字符）
                 */
               reader = new InputStreamReader(in);
               bufferedReader = new BufferedReader(reader);
               String info = "";
               String temp = null;
               while((temp = bufferedReader.readLine())!= null){
                   info += temp;     //读取一行
               }
                System.out.println(info);
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                if(!(null == in)){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(!(null == reader)){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(!(null == bufferedReader)){
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
}
