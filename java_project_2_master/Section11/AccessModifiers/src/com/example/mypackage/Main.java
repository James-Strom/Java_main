package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
        Account jamesAccount = new Account("James");
        jamesAccount.deposit(1000);
        jamesAccount.withdraw(500);
        jamesAccount.withdraw(-200);
        jamesAccount.deposit(-200);
        jamesAccount.deposit(-20);
        jamesAccount.calculateBalance();

        System.out.println("Balance on account is " + jamesAccount.getBalance() );
    }
}
