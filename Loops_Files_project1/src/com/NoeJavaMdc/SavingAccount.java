package com.NoeJavaMdc;

/**
 * Created by @Noe Miniel on 4/20/2016.
 * Github Noe007
 * TODO: #Finish
 */
public class SavingAccount {

    private double balance;
    private double annualInterestRate;
    private int depositsCounts;
    private int withdrawCounts;

    private double lastInterestEarned;

    public SavingAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double ourWithdraw) {
        balance = balance - ourWithdraw;
        withdrawCounts++;
    }

    public double getLastInterestEarned() {
        return lastInterestEarned;
    }

    public void deposit(double ourDeposit) {
        balance = balance + ourDeposit;
        depositsCounts++;
    }

    public int getDepositsCounts() {
        return depositsCounts;
    }

    public int getWithdrawCounts() {
        return withdrawCounts;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void calInterest() {
        double monthlyInterest = annualInterestRate / 12;
        lastInterestEarned = monthlyInterest * balance;
        balance += (lastInterestEarned);
    }

}









