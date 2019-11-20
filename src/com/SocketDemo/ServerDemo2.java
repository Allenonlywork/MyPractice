package com.SocketDemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8090);
            System.out.println("服务端已启动");
            while(true){
                Socket socket = serverSocket.accept();
                SocketThread socketThread = new SocketThread(socket);
                Thread thread = new Thread(socketThread);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
