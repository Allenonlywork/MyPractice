package com.SocketDemo;

import java.io.*;
import java.net.Socket;

public class SocketThread implements Runnable{
    private Socket socket;

    public SocketThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        //获取一个输入流，用于接收客户端的消息
        try {
            InputStream in = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(in);//将字节流转换成字符流
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//缓冲流

            String temp = null;
            String info = "";
            while((temp = bufferedReader.readLine())!= null){
                info += temp;
                System.out.println("已接收到来自客户端的连接");
                System.out.println("已接收到来自客户端的消息：" + info + "当前客户端的IP:" +
                        socket.getInetAddress().getHostAddress());
            }

            //获取一个输出流，用于向客户端发送消息
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.print("你好，服务端已接受到来自您的信息");
            printWriter.flush();
            socket.shutdownOutput();

            outputStream.close();
            bufferedReader.close();
            inputStreamReader.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
