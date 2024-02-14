package com.lapeng;

public class CheckAccount extends Accounts{

    public CheckAccount(String name, double balance, String pin) {
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
        }
        double transaction_Amt = transactions;
        transaction_Amt =  0.1;
        balance -= transaction_Amt;
        System.out.println("There was a transaction charge of " +transaction_Amt+ "for this withdrawal.");
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
        minBalance = 100.00;
        penalty = 10.0;

        if(balance < minBalance){
            balance -= penalty;
            System.out.println("Your balance is below the minimum balance, hence there was penalty. Your new balance is: "+balance);
        }
    }

    @Override
    void computeInterest() {
        interest = balance * (0.07/12);
        balance += interest;
    }
}
