package com.myTest;




public class MyTest {

    static boolean b;
    public static void main(String[] args) {
        boolean c;

        byte[] b = new byte[]{ 0x0e };

        String split = new String(new byte[]{ 0x0e });

        FiledTest filedTest = new FiledTest();
        filedTest.geta();
        System.out.println(filedTest.getb());
//        System.out.println(b);
//        System.out.println("==="+split+"===");
       /* System.out.println(c);

        if(1>2){
            b= true;
        }
        System.out.println("1:"+b);
       if(b){
           System.out.println("2:"+b);
       }*/

       // new MyTest().getzzz();
    }


    boolean c;
    int i;

    public void getzzz(){

        System.out.println(i);
        System.out.println(c);
    }
}
