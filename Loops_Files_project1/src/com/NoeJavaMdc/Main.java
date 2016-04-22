package com.NoeJavaMdc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    //make static
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {



        say("What is your starting Balance?");
        double sBalance = in();
        say("What is your Interest Rate");
        double sInterest = in();

        //make a new instans of SavingsAccount
        SavingAccount NoeTest = new SavingAccount(sBalance,sInterest);
        say("How many months since the account was open?");

        double montlyDeposit;
        double monthlyWithdrawl;
        double interestEarned = 0.0;
        double totalDeposits = 0;
        double totalWithdrawn = 0;


        int numbersOfMonths = (int) in();


        for(int i = 0; i < numbersOfMonths ; i++){

             //deposit
            say("How much money did you deposits on the " + i + "th month?");
            montlyDeposit = in();
            totalDeposits += montlyDeposit;
            NoeTest.deposit(montlyDeposit);

            //Withdraw
            say("How much money did you withdraw on the " + i + "th month?");
            monthlyWithdrawl = in();
            totalWithdrawn += monthlyWithdrawl;
            NoeTest.withdraw(monthlyWithdrawl);

            //Calculate Interest
            NoeTest.calInterest();
            //interest gain
            interestEarned += NoeTest.getLastInterestEarned();
        }

        // Display the totals and the balance.
        say("Total deposited: $" + dollar(totalDeposits));
        say("Total withdrawn: $" + dollar(totalWithdrawn));
        say("Interest earned: $" + dollar(interestEarned));
        say("Ending balance: $" + dollar(NoeTest.getBalance()));


        //TODO: #Finish
    }



    public static void say(String i){
        //Print something
        System.out.println(i);
    }
    public static double in(){
    //return a double from keyboard
        return  in.nextDouble();
    }

    public static String dollar(Double oo){
//        Create a DecimalFormat object for formatting output.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        return (String)dollar.format(oo);

    }
}
