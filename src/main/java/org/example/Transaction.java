package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Transaction {
    private double prix;
    private String type;
    private int quantite;
    private Asset asset;
     LocalDateTime date ;
     private Trader trader;
    public Transaction(String type ,double prix,  int quantite ,Asset asset , Trader trader) {
        this.prix = prix;
        this.type = type;
        this.quantite = quantite;
        this.date = LocalDateTime.now();
        this.asset = asset;
        this.trader = trader;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setMyObj(LocalDateTime myObj) {
        this.date = myObj;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "prix=" + prix +
                ", type='" + type + '\'' +
                ", quantite=" + quantite +
                ", asset=" + asset +
                ", date=" + date +
                ", trader=" + trader +
                '}';
    }
}
