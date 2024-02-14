package com.lapeng;

public class RegularAccount extends Accounts{

    public RegularAccount(String name, double balance, String pin) {
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
            System.out.println("You have withdrawn "+amount+ " from "+balance+", \nand your new balance is: "+ (balance -= amount));

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

        double fee = Math.min(10,balance * 0.1);
        balance -= fee;
        minBalance = 500.0;
        penalty = 10.0;

        if(balance < minBalance){
            balance -= penalty;
            System.out.println("Your balance is below the minimum balance, hence there was penalty of " +penalty+". \nYour new balance is: R"+balance);
        }
    }

    @Override
    void computeInterest() {

    }


}
