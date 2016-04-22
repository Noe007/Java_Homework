package com.NoeJavaMdc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount test = new SavingsAccount(500,0.5);

        say("Testing Balance Class:");

        //Show Balance
        say("This the balances: " + test.getBalance());

        //Deposit some money
        say("Deposit some money: ");

        test.deposit(input.nextInt());
        //print balance after deposit

        say("This the balance: " + test.getBalance());

        //Withdraw money

        say("withdraw some money: ");
        test.withdraw(input.nextInt());

        //print balance after Withdraw
        say("This the balance: " + test.getBalance());
    }

    public static void say(String Message){
        System.out.println(Message);
    }

}
