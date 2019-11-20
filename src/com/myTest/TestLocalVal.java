package com.myTest;

public class TestLocalVal {
    private String name;
    public static void main(String[] args) {
        if (1 == 1) {
            String a = "1234";
        }
//        System.out.println(a);
        String s = "12";
        System.out.println(s.hashCode());

        TestLocalVal t = new TestLocalVal();

    }
    public TestLocalVal(){}

    public TestLocalVal(String name){
        this.name = name;
    }

}
