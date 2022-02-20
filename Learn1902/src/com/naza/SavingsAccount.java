package com.naza;

public class SavingsAccount {
    int balance;

    public SavingsAccount (int initialBalance) {
        balance = initialBalance;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(5000);
        // check balance
        System.out.println("Your balance is: "+ savings.balance);

        //withdrawing
        int afterWithdraw = savings.balance - 500;
        savings.balance  = afterWithdraw;
        System.out.println("You just withdrew: " + 500);

        //check balance
        System.out.println("Your balance is: " + savings.balance);

        //deposit
        int afterDeposit = savings.balance  + 800;
        savings.balance = afterDeposit;
        System.out.println("You just deposited: " + 800);

        //check balance
        System.out.println("Your balance is: "+ savings.balance);

        //deposit 2
        int afterDeposit2  = savings.balance + 1200;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited: " + 1200);
        //check balance
        System.out.println("Your balance is: " + savings.balance);
    }
}
