package com.driver;

public class LimitExceed extends RuntimeException{
    public LimitExceed(String msg){
        super(msg);
    }
}
