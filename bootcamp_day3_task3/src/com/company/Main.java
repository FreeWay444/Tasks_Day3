package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here

        BankAccount obj = new BankAccount();
        obj.printBalance();
        obj.deposit(30);
        obj.withdraw(40);
        obj.printBalance();
        obj.deposit(5500);
        obj.transferFrom(60);
    }
}
