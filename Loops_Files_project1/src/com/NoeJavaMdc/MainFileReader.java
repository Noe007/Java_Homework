package com.NoeJavaMdc;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Noe on 4/21/2016.
 * Todo: #Finish
 */


public class MainFileReader {
    //make static
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws FileNotFoundException {



/*
        say("What is your Interest Rate");
        double sInterest = in();
*/
        //CREATE a new instans of SavingsAccount
        SavingAccount NoeTest = new SavingAccount(500.00, 5);

        double interestEarned = 0.0;
        double totalDeposits = 0;
        double totalWithdrawn = 0;

        //DEPOSIT
        File file = new File("Deposits.txt");
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()) {
            //read
            double num = inputFile.nextDouble();
            //deposit
            NoeTest.deposit(num);
            //add to total
            totalDeposits += num;
        }
        inputFile.close();

        //WITHDRAW
        File file2 = new File("Withdrawals.txt");
        Scanner inputFile2 = new Scanner(file2);
        while (inputFile2.hasNext()) {

            double num2 = inputFile2.nextDouble();
            NoeTest.withdraw(num2);
            totalWithdrawn += num2;
        }
        inputFile2.close();


        NoeTest.calInterest();

        // Display the totals and the balance.
        say("Total deposited: $" + dollar(totalDeposits));
        say("Total withdrawn: $" + dollar(totalWithdrawn));
        say("Interest earned: $" + dollar(interestEarned));
        say("Ending balance: $" + dollar(NoeTest.getBalance()));
        //TODO: #Finish
    }


    public static void say(String i) {
        //Print something
        System.out.println(i);
    }

    public static double in() {
        //return a double from keyboard
        return in.nextDouble();
    }

    public static String dollar(Double oo) {
//        Create a DecimalFormat object for formatting output.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        return (String) dollar.format(oo);

    }
}

