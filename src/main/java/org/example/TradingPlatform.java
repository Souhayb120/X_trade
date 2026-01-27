package org.example;
import  java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TradingPlatform {
    private String name;
    private String web_Adress;
    private List<Trader> traderlist;
    private List<Transaction> transactionlist;
    private List<Asset> assetlist;

    public TradingPlatform(String name, String web_Adress) {
        this.name = name;
        this.web_Adress = web_Adress;
        this.assetlist =  new ArrayList<>();
        this.traderlist =  new ArrayList<>();
        this.transactionlist =  new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb_Adress() {
        return web_Adress;
    }

    public void setWeb_Adress(String web_Adress) {
        this.web_Adress = web_Adress;
    }

    public List<Trader> getTraderlist() {
        return traderlist;
    }

    public void setTraderlist(List<Trader> traderlist) {
        this.traderlist = traderlist;
    }

    public List<Transaction> getTransactionlist() {
        return transactionlist;
    }

    public void setTransactionlist(List<Transaction> transactionlist) {
        this.transactionlist = transactionlist;
    }

    public List<Asset> getAssetlist() {
        return assetlist;
    }

    public void setAssetlist(List<Asset> assetlist) {
        this.assetlist = assetlist;
    }



    Scanner sc = new Scanner(System.in);

    // Ajouter un Trader
    public void add_Trader() {
        try {
            System.out.println(" Enter  name :");
            String name = sc.nextLine();
            System.out.println(" Enter age :");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println(" Enter your Trader Number :");
            int TraderNumber = sc.nextInt();
            sc.nextLine();
            Trader trader = new Trader(name,age,TraderNumber);
            traderlist.add(trader);
            System.out.println("trader has added successfully");
        } catch (Exception e) {
            System.out.println("Errore : You have to enter a Number " + e);

        }

    }

    // DISPLAY ACCOUNTS
    public void afficher_Traders() {
        try {
            if (!traderlist.isEmpty()) {
                for (Trader trader : traderlist) {
                    System.out.println(trader.getNom() + " Trader N° " + trader.getTraderNum() + " Balance : " + trader.getSold_initial());
                }
            } else {
                System.out.println("no Traders currently !!");
            }
        } catch (Exception e) {
            System.out.println("somthing wrong Displaying Traders !!!");

        }

    }
}
