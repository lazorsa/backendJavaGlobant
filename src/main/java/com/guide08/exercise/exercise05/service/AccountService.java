package com.guide08.exercise.exercise05.service;

import com.guide08.exercise.exercise05.entity.Account;

import java.util.Scanner;

public class AccountService {
    private Account account= new Account();
    Scanner scanner = new Scanner(System.in);
    private static double topLimit = 0.20;

    /**
     * Create a new account requesting the data to the user using class Scanner
     */
    public Account createAccount() {
        System.out.print("Enter the number account: ");
        account.setNumberAccount(scanner.nextInt());
        System.out.print("Enter the id client: ");
        account.setIdClient(scanner.nextLong());
        System.out.print("Enter the current balance: ");
        account.setCurrentBalance(scanner.nextInt());
        System.out.print("Enter the interest rate: ");
        account.setInterestRate(scanner.nextDouble());

        return account;
    }

    /**
     * Deposit money in the account
     */
    public void depositMoney() {
        System.out.print("Enter the amount to deposit: ");
        int amount = scanner.nextInt();
        account.setCurrentBalance(account.getCurrentBalance() + amount);
    }

    /**
     * Retire money from the account
     */
    public void withdrawMoney() {
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        account.setCurrentBalance(account.getCurrentBalance() - amount);
    }

    /**
     * Fast retire money from the account
     */
    public void fastWithdrawMoney() {
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount <= getTopLimit()*account.getCurrentBalance()) {
            account.setCurrentBalance(account.getCurrentBalance() - amount);
        } else {
            System.out.println("You don't have enough money");
        }
    }

    public static double getTopLimit() {
        return topLimit;
    }

    public static void setTopLimit(double topLimit) {
        AccountService.topLimit = topLimit;
    }

    /**
     * Consult the balance of the account
     */
    public void consultBalance() {
        System.out.println("The current balance is: " + account.getCurrentBalance());
    }

    /**
     * Consult all the information of the account
     */
    public void consultAllInformation() {
        System.out.println("The number account is: " + account.getNumberAccount());
        System.out.println("The id client is: " + account.getIdClient());
        System.out.println("The current balance is: " + account.getCurrentBalance());
        System.out.println("The interest rate is: " + account.getInterestRate());
    }
}
