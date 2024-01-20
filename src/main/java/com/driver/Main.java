package com.driver;

public class Main {
    public static void main(String[] args) {
        try{
            CurrentAccount c = new CurrentAccount("Haritha",10000,"srsiin123");
            System.out.println("Account number : " + c.generateAccountNumber(9,120));
            c.validateLicenseId();
            c.deposit(5000);
            System.out.println("Amount withdrawal successful ");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            SavingsAccount s = new SavingsAccount("Swathi",20000,10000,3);
            System.out.println("Account number : " + s.generateAccountNumber(3,27));
            s.withdraw(10000);
            System.out.println("Amount withdrawal successful ");
            System.out.println("Compound interest : " + s.getCompoundInterest(12,3));
            System.out.println("Simple number : " + s.getSimpleInterest(5));
            s.deposit(2000);
            System.out.println("Amount deposit successful ");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}