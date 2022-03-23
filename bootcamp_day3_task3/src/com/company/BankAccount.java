package com.company;

public class BankAccount {
        int Balance;

        public BankAccount(){
            Balance=0;
        }
        public void deposit(int value){
            if (value>0 && value<=5000) {
                Balance += value;
            } else {
                System.out.println("Transaction cancelled. Max deposit - 5000. Your deposit - "+value);
            }
        };
        public void withdraw(int value){
            if (value>0 && value<=Balance){
                Balance-=value;
            }else{
                System.out.println("There is not enough funds.");
            }
        }
        public void printBalance(){
            System.out.println("Your balance is "+ Balance);
        }
        public void transferFrom(int value){
            if (value<=Balance && value<0) {
                Balance-=value;
            }else {
                System.out.println("Transfer cancelled. You are trying to transfer "+value+",but only "+Balance+" is available.");
            }
            // somewhere else newBalance=Balance
        }

}

