package com.lapeng;

public class Main {
    public static void main(String[] args)
        {
            RegularAccount accountHolder1 = new RegularAccount("Lebohang Mofokeng", 80.0, "2345");
            accountHolder1.computeFees();
            accountHolder1.withdrawAmount(50);

            RegularAccount accountHolder2 = new RegularAccount("Ntuthuko Yiga", 700, "9898");
            accountHolder2.computeFees();
            accountHolder2.withdrawAmount(500);

            InterestAccount interestAccount = new InterestAccount("Manthaka Alumant", 1700, "5998");
            interestAccount.computeInterest();
            interestAccount.computeFees();
            interestAccount.withdrawAmount(400);

            CheckAccount checkAccount = new CheckAccount("Alu", 8000.5, "5641");
            checkAccount.deposiAmount(15);
        }

    }
