package com.NoeJavaMdc;

/**
 * Created by Noe on 4/21/2016.
 */
public class SavingsAccount extends BankAccount {


    SavingsAccount(double balance, double annualInterestRate){
        super(balance,annualInterestRate);

    }

    public String getisTheAccountActive() {
        if(isTheAccountActive == true){
            return "Active";

        }else{

            return "Non-Active";
        }
    }

    private boolean isTheAccountActive = true;
    //Override
    public  void withdraw(double ourWithdraw){

        if (getBalance() < 25){

            isTheAccountActive = false;

        }else{

            isTheAccountActive = true;
            super.withdraw(ourWithdraw);
        }


    }

    //Override
    public  void deposit(double ourDeposit){


        if(isTheAccountActive){

            super.deposit(ourDeposit);
        }else {
            super.deposit(ourDeposit);
            isTheAccountActive = true;
        }




    }


    //Override
    public void  monthlyProcess(){

        if(getNumOfWidthwals() >= 4) {
            super.setMonthlyServiceCharge(getMonthlyServiceCharge() +( 1 *(getNumOfWidthwals() - 4)));
            super.monthlyProcess();

            if (getBalance() < 25){
                isTheAccountActive = false;
            }

        }else{

            super.monthlyProcess();
        }




    }




}









