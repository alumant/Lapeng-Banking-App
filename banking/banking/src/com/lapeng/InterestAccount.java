package com.lapeng;

public class InterestAccount extends Accounts{

    public InterestAccount(String name, double balance, String pin) {
        super(name, balance, pin);
    }
    @Override
    void createAccount() {

    }

    @Override
    void deposiAmount(double amount) {

    }

    @Override
    void withdrawAmount(double amount) {

        if (amount > balance){
            System.out.println("Insufficient funds");
        }else {
            balance  -= amount;
            System.out.println("You have withdrawn "+amount+ " from "+(balance)+", \nand your new balance is: "+ (balance));
        }
    }

    @Override
    void setRate(double rate) {

    }

    @Override
    void validatePin() {

    }

    @Override
    void computeFees() {
        double fee =Math.min(10,balance * 0.1);
        balance -= fee;
    }

    @Override
    void computeInterest() {
        interest = balance * (0.07/12);
        balance += interest;
        System.out.println("your new balance with interest is " +balance);

    }

}
