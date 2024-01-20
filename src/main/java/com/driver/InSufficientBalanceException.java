package com.driver;

public class InSufficientBalanceException extends RuntimeException{
    public InSufficientBalanceException(String message){
        super(message);
    }
}
