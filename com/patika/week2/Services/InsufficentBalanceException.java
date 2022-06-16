package com.patika.week2.Services;

public class InsufficentBalanceException extends Exception{
    public InsufficentBalanceException(double currentBalance, double invoiceAmount){
        System.err.printf("Account has insufficient balance:%nCurrent balance: %d%nInvoice amount: %d%n", currentBalance, invoiceAmount);
    }
    
}
