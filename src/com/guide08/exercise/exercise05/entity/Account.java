package com.guide08.exercise.exercise05.entity;

public class Account {
    private int numberAccount;
    private long idClient;
    private int currentBalance;

    private double interestRate;

    public Account() {
    }

    public Account(int numberAccount, long idClient, int currentBalance, double interestRate) {
        this.numberAccount = numberAccount;
        this.idClient = idClient;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
