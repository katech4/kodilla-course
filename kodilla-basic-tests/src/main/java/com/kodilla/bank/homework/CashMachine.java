package com.kodilla.bank.homework;

public class CashMachine {
    int[] t1 = {100, 200, 150, 300};
    CashMachine euronet = new CashMachine(t1);

    int[] t2 = {200, 10, 50, 150};
    CashMachine neonet = new CashMachine(t2);

    CashMachine[] machines= {euronet, neonet};

    Bank ing = new Bank(machines);

    private int[] transactions;

    public CashMachine(int[] transactions){
        this.transactions = transactions;
    }

    public int getAllTransactions(){
        return transactions.length;
    }

    public int sumOfTransactions(){
        return sumOfTransactions();
    }



}
