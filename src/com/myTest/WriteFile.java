package com.myTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteFile {
    public static void main(String[] args) {
        InputStream inputStream;
        OutputStream out;
        try{
            inputStream = new FileInputStream("a.txt");
            out = new FileOutputStream("b.txt");
            byte[] b = new byte[1024];
            int n = -1;
            while((n = inputStream.read(b))!= -1){
//                String str = new String(,0,n,"GBK");
                out.write(b);
            }
            inputStream.close();
            out.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {

        }


    }
}
