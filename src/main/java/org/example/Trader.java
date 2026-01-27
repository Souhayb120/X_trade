package org.example;

import java.util.List;

public class Trader extends Person{
    private int traderNum;
private double sold_initial;
private List<Transaction> transactionList;
    public Trader(String nom, int age, int traderNum ) {
        super(nom, age);
        this.traderNum = traderNum;
        this.sold_initial = 0.0;

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
}
