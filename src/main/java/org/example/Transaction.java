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
     LocalDateTime myObj ;
    public Transaction(String type ,double prix,  int quantite ,Asset asset) {
        this.prix = prix;
        this.type = type;
        this.quantite = quantite;
        this.myObj = LocalDateTime.now();
        this.asset = asset;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public LocalDateTime getMyObj() {
        return myObj;
    }

    public void setMyObj(LocalDateTime myObj) {
        this.myObj = myObj;
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



}
