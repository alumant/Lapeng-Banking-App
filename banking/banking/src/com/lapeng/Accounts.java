package com.lapeng;

public abstract class Accounts {

    //ATTRIBUTES


    public Accounts(String name, double balance, String pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    String name;
    double balance;
    String pin;
    double minBalance;
    double penalty;
    double interest;
    int transactions;
    int months;
    double rate;

//METHODS
    abstract void createAccount();
    abstract void deposiAmount(double amount);
    abstract void withdrawAmount(double amount);
    abstract void setRate(double rate);
    abstract void validatePin();
    abstract void computeFees();
    abstract void computeInterest();
}


