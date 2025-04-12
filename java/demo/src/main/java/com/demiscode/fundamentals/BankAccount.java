package com.demiscode.fundamentals;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) throws IllegalArgumentException {
        if (balance < 0)
            throw new IllegalArgumentException("Initial balance cannot be negative!!");
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount cannot be 0 or less!!");
        this.balance += amount;
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount cannot be negative!!");

        if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance!!!");

        this.balance -= amount;
    }
}
