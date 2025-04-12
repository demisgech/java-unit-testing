package com.demiscode.fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void shouldThrowExceptionIfInitialBalanceIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-10);
        });
    }

    @Test
    public void shouldCreateBankAccountWithPositiveBalance() {
        var account = new BankAccount(10);
        assertEquals(10, account.getBalance());
    }

    @Test
    public void shouldThrowExceptionIfDepositAmountIsNotPositive() {
        var account = new BankAccount(10);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10);
        });
    }

    @Test
    public void shouldThrowExceptionIfDepositeAmountIsZero() {
        var account = new BankAccount(100);

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });
    }

    @Test
    public void shouldDepositPositiveAmountSuccessfully() {
        var account = new BankAccount(10);
        account.deposit(10);

        assertEquals(20, account.getBalance());
    }

    @Test
    public void shouldThrowExceptionIfWithdrawAmountIsNegative() {
        var account = new BankAccount(10);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-10);
        });
    }

    @Test
    public void shouldThrowExceptionIfWithdrawAmountIsAboveAvailableBalance() {
        var account = new BankAccount(100);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200);
        });
    }

    @Test
    public void shouldThrowExceptionIfWithdrawAmountIsZero() {
        var account = new BankAccount(100);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(0);
        });
    }

    @Test
    public void shouldWithdrawValidAmountSuccessfully() {
        var account = new BankAccount(200);

        account.withdraw(100);

        assertEquals(100, account.getBalance());
    }
}
