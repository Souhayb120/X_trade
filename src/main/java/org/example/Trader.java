package org.example;

import java.util.List;

public class Trader extends Person{
    private int traderNum;
private double sold_initial;
private Portfolio portfolio;
private List<Transaction> transactionList;
    public Trader(String nom, int age, int traderNum ) {
        super(nom, age);
        this.traderNum = traderNum;
        this.sold_initial = 0.0;
        this.portfolio = new Portfolio<>();
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public int getTraderNum() {
        return traderNum;
    }

    public void setTraderNum(int traderNum) {
        this.traderNum = traderNum;
    }

    public double getSold_initial() {
        return sold_initial;
    }

    public void setSold_initial(double sold_initial) {
        this.sold_initial = sold_initial;
    }


    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }


}
