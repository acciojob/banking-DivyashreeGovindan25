package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name,balance,0);
        this.maxWithdrawalLimit = maxWithdrawalLimit;
        this.rate = rate;
    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if(amount > maxWithdrawalLimit) throw new MaxWithdrawLimitException("Maximum Withdraw Limit Exceed");
        //else if(amount > super.getBalance()) throw new InsufficientBalanceException("Insufficient Balance");
        else super.withdraw(amount);
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        double interest = getBalance()*(rate/100)*years;

        return getBalance() + interest;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double P = getBalance();
        double r = rate/100;
        int n = times;
        int t = years;
        double A = P * (Math.pow((1 + (r/n)), (n*t)));
        return A;

    }
    public double getRate() {
        return rate;
    }
    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }
}
