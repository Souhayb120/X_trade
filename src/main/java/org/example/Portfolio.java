package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Portfolio {

    private Trader trader;
    private List<Transaction> transactions;
    private  Map<String, Integer> map = new HashMap<>();

    public Portfolio(Trader trader) {
        this.trader = trader;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public Map<String , Integer> getMap() {
        return map;
    }

    public void setMap(String typeActif, int quantite) {
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
            System.out.println("Date " + transaction.getDate());
            System.out.println("Quantite " + transaction.getQuantite());
            System.out.println("Transaction made By : " + trader.getNom());
            System.out.println("*******************************************************************");
        }
    }



}
