package com.SocketDemo;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

    public static void main(String[] args) {

        Socket socket = null;
        try {
            //创建Socket对象
            socket = new Socket("127.0.0.1",8090);
            //获取一个输出流，用于向服务器输出
            OutputStream out = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(out);
            printWriter.print("打印。。。");
            printWriter.flush();
            socket.shutdownOutput();
            //获取一个输入流，用于接收服务器的输出
            InputStream in = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(in);   //将输入流包装成字符流
            BufferedReader bufferedReader =new BufferedReader(inputStreamReader);//字符流缓冲区
            String info = "";
            String str = null;
            while((str=bufferedReader.readLine())!=null){
                info+=str;
                System.out.println("接收到来自服务器端的消息："+info);
            }

            //关闭资源
            bufferedReader.close();
            inputStreamReader.close();
            in.close();
            out.close();
            socket.close();
        }catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
