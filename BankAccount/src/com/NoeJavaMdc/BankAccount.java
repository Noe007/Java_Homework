package com.NoeJavaMdc;

/**
 * Created by Noe on 4/21/2016.
 *
 */



public class BankAccount {


    private  double balance;
    private  int numOfDeposits;
    private  int numOfWidthwals;
    private  double annualInterestRate;
    private double monthlyServiceCharge;

    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public double getBalance() {
        return balance;
    }
    public int getNumOfWidthwals() {
        return numOfWidthwals;
    }
    public double getMonthlyServiceCharge() {
        return monthlyServiceCharge;
    }
    public void setMonthlyServiceCharge(double monthlyServiceCharge) {
        this.monthlyServiceCharge = monthlyServiceCharge;
    }
    public  void deposit(double ourDeposit){
        numOfDeposits += numOfDeposits ;
        balance = balance + ourDeposit;
    }
    public  void withdraw(double ourWithdraw){
        numOfWidthwals += numOfWidthwals;
        balance = balance - ourWithdraw;
    }
    public void calcInterest(){
        double monthlyInterest = (annualInterestRate/12);
        monthlyInterest = monthlyInterest *balance;
        balance = balance + monthlyInterest;
    }

    public void  monthlyProcess(){

        balance = balance - monthlyServiceCharge;
        calcInterest();
        numOfWidthwals =0;
        numOfDeposits =0;
        monthlyServiceCharge =0;
    }

}

