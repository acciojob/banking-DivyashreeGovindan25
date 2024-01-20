package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    private static String accountNumber;
    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }
    public double getBalance(){
        return balance;
    }
    public double getMinBalance(){
        return minBalance;
    }
    public String getName(){
        return name;
    }
    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        StringBuilder accno;
        if (9 * digits < sum || sum < 0)
            throw new AcNumberException("Account Number can not be generated");
        else {
            accno = new StringBuilder();
            int nines = sum / 9;
            int rem = sum % 9;
            while (nines-- > 0)
                accno.append("9");
            if (rem > 0)
                accno.append(String.valueOf(rem));
            while (accno.length() < digits)
                accno.append("0");
        }
        return accno.toString();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if(amount > balance || (balance-amount < minBalance)) throw new InSufficientBalanceException("Insufficient Balance");
        else balance -= amount;
    }
//    private static void recur(int digits,int sum,String accountNo){
//        if(sum == 0 && digits == 0){
//            accountNumber = accountNo;
//        }
//        if(sum < 0 || digits < 0) return;
//        if(!accountNumber.equals("")) return;
//        for(int i=0; i<=9; i++){
//            if(sum-i >= 0) recur(digits-1,sum-i,accountNo+i);
//        }
//    }
}