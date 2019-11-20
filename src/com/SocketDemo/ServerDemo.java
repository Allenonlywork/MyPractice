package com.SocketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8090);
            System.out.println("服务端已启动，等待客户端连接");
            Socket socket = serverSocket.accept();

            //获取输入流，接收客户端传递的消息
            InputStream in = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
            String info = "";
            String temp = null;
            while((temp = bufferedReader.readLine())!=null){
                info+= temp;
                System.out.println("已接收到客户端的连接");
                System.out.println("服务端接收到客户端的消息：" +"\r\n"+ info + "\r\n"+"当前客户端IP为：" +
                        socket.getInetAddress().getHostAddress());
            }

            //获取一个输出流，向客户端发送消息
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);//将输出流包装成打印流
            printWriter.print("你好，服务端已接收到消息");
            printWriter.flush();
            socket.shutdownOutput(); //关闭输出流

            outputStream.close();
            bufferedReader.close();
            inputStreamReader.close();
            in.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
