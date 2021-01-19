package com.daily_job._202101._20210115;

public class Manager {
    Object j = 0;
    private static Manager manager = new Manager();

    private Manager(){

    }
    public static Manager getInstance(){
        return manager;
    }
}
