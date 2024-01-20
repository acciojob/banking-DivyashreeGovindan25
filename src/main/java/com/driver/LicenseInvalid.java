package com.driver;

public class LicenseInvalid extends RuntimeException{
    public LicenseInvalid(String message){
        super(message);
    }
}
