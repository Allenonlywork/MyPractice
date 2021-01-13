package com.file_ioStream;

import java.io.*;

/**
 * 写文件
 */
public class WriteFile {
    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer("20210012");
        s1.append("^").append("2021").append("^").append("S").append("^").append("00");
        StringBuffer s2 = new StringBuffer("20210013");
        s2.append("^").append("2021").append("^").append("S").append("^").append("00");
        StringBuffer s = s1.append("\n").append(s2);
        File file = null;
        OutputStream out = null;
        BufferedOutputStream bf = null;
        try{
            file = new File("test.txt");
            out = new FileOutputStream(file);
            bf = new BufferedOutputStream(out);
            byte[] bytes = s.toString().getBytes();
            bf.write(bytes);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bf != null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
