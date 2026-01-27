package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Transaction {
    private double prix;
    private String type;
    private int quantite;
    private Date date;
    private List<Asset> assetList;

    public Transaction(double prix, String type, int quantite, Date date) {
        this.prix = prix;
        this.type = type;
        this.quantite = quantite;
        this.date = date;
        this.assetList = new ArrayList<>();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }





}
