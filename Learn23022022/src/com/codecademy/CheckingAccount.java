package com.codecademy;

public class CheckingAccount {
    String name;
    private int balance;

    public CheckingAccount(String inputName, int inputBalance){
        name = inputName;
        balance = inputBalance;
    }

    void addFunds(int fundsToAdd){
        balance += fundsToAdd;
    }

    void getInfo(){
        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }

    public static void main(String[] args){
        CheckingAccount myAccount = new CheckingAccount("Naza", 2000);
        System.out.println(myAccount.balance);
        myAccount.addFunds(5);
        System.out.println(myAccount.balance);
    }

}