package com.SocketDemo;

import java.io.IOException;
import java.net.Socket;

/**
 * 扫描主机上1到1024的端口，判断这些端口是否被服务器监听
 *
 * @author hanfeng
 * @data 2012-8-24 上午10:25:57
 */
public class PortScanner {

    public static void main(String[] args) {
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        new PortScanner().scan(host);
    }

    public void scan(String host) {
        Socket socket = null;

        for (int port = 8899; port < 8903; port++) {
            try {
                socket = new Socket(host, port);
                System.out.println("连接到端口：" + port);
            } catch (IOException e) {
                System.out.println("无法连接到端口：" + port);
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
