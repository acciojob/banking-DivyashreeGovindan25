package com.driver;

public class MaxWithdrawLimitException extends RuntimeException{
    public MaxWithdrawLimitException(String msg){
        super(msg);
    }
}
