package com.lapeng;

public class CdAccount extends Accounts{

    public CdAccount(String name, double balance, String pin) {
        super(name, balance, pin);
    }
    @Override
    void createAccount() {

    }

    @Override
    void deposiAmount(double amount) {
        balance += amount;
        double transaction_Amt = transactions;
        transaction_Amt =  0.1;
        balance -= transaction_Amt;
        System.out.println("There was a transaction charge of " +transaction_Amt+" for this deposit. \nYour new balance is "+balance);
    }

    @Override
    void withdrawAmount(double amount) {

        if (amount < balance){
            System.out.println("Insufficient funds");
        }else {
            balance -= amount;
            months = 12;
            if (months < 12){
                penalty = balance * 0.2;
                balance -= penalty;
            }

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
        double fee = Math.min(10, balance * 0.1);
        balance -= fee;
    }

    @Override
    void computeInterest() {

        interest = 0.15 / months;
    }
}
