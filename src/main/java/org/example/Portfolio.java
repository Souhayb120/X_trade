package org.example;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private Trader trader;
    private List<Transaction> transactions;

    public Portfolio(Trader trader) {
        this.trader = trader;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

public List<Transaction> getT(){
        return transactions;
};
    public void getTransactions() {
        int i = 1;
        for(Transaction transaction : transactions){
            System.out.println("**************************Transaction°N"+ (i++) +"***********************");
            System.out.println("Type " + transaction.getType());
            System.out.println("Name " + transaction.getAsset().getName());
            System.out.println("Prix " + transaction.getAsset().getPrix());
            System.out.println("Date " + transaction.getMyObj());
            System.out.println("Quantite " + transaction.getQuantite());
            System.out.println("Transaction made By : " + trader.getNom());
            System.out.println("*******************************************************************");
        }
    }
}
