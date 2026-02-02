package org.example;
import  java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TradingPlatform {
    private String name;
    private String web_Adress;
    private List<Trader> traderlist;
    private List<Transaction> transactionlist;
    private List<Asset> assetlist = new ArrayList<>();

    public TradingPlatform(String name, String web_Adress) {
        this.name = name;
        this.web_Adress = web_Adress;
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

    //***************************
    // Admin Methods
    //***************************

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

    // DISPLAY Traders
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

    // Ajouter un actif
    public void add_Actif() {
        try {
            System.out.println(" Enter  actif type:");
            String type = sc.nextLine();
            System.out.println(" Enter  actif name:");
            String name = sc.nextLine();
            System.out.println(" Enter actif code :");
            int code = sc.nextInt();
            System.out.println(" Enter actif Price :");
            double price = sc.nextDouble();
            System.out.println(" Enter quantite of this actif :");
            int quantite = sc.nextInt();
            sc.nextLine();
if(type.equals("stock")){
    Stock stock = new Stock(name,code,price,type,quantite);
    assetlist.add(stock);
    System.out.println("Stock has added successfully");
}else if(type.equals("crypto")){
    CryptoCurrency crypto = new CryptoCurrency(name,code,price,type,quantite);
    assetlist.add(crypto);
    System.out.println("Crypto has added successfully");
}else{
    System.out.println("type invalid !!");
}


        } catch (Exception e) {
            System.out.println("Errore : You have to enter a Number " + e);

        }

    }

    // DISPLAY Actif
    public void afficher_Actif() {
        try {
            if (!assetlist.isEmpty()) {
                for (Asset asset : assetlist) {
                    System.out.println("actif Name : " + asset.getName() + " ,Actif Code " + asset.getCode() + " ,Actif Price " + asset.getPrix() + " ,Actif Type " + asset.getType_Actif() + " ,Quantite " + asset.getQuantite());
                }
            } else {
                System.out.println("no Actifs currently !!");
            }
        } catch (Exception e) {
            System.out.println("somthing wrong Displaying Actifs !!!");
            ;
        }
    }



    //***************************
    // Trader Methods
    //****************************

 // acheter un actif
    public void acheter_Actif(){
        System.out.println("enter your trading ID : ");
        int Number = sc.nextInt();
        Trader tr = null;
        Asset asset = null;
        for(Trader trader:traderlist){
            if(Number == trader.getTraderNum()){
                tr = trader;
            }
        }
        if(tr != null){

            for(int i = 0 ; i < assetlist.size() ; i++){
                System.out.println((i + 1) + " " + assetlist.get(i).getName() + ", Code : " + assetlist.get(i).getCode()+" Quantite : " + assetlist.get(i).getQuantite() + ", Prix : " + assetlist.get(i).getPrix() + "$");
            }
            try{
                System.out.println("******************************");
                System.out.println("enter number of actif u wanna buy :");
                int choice = sc.nextInt();
                for(Asset ast : assetlist){
                    if(choice == assetlist.indexOf(ast) + 1){
                        asset = ast;
                        System.out.println("you choose " + asset.getName());
                    }
                }

                if(asset != null){

                }
            } catch (Exception e) {
                System.out.println("errore" + e);
            }



        }



    }
// deposit argents
    public void deposit(){
        System.out.println("enter your trading Number");
        int Number = sc.nextInt();
        Trader trader = null;
        for(Trader trader1 : traderlist){
            if(trader1.getTraderNum() == Number){
                trader = trader1;
            }
        }
        if(trader != null){
            System.out.println("how much you wanna deposit ");
            double montant = sc.nextDouble();
            trader.setSold_initial(montant);
            System.out.println("Operation Made successfully !!");
            System.out.println("your new balance is " + montant + "$");
        }else {
            System.out.println("somthing wrong deposit money");
        }
    }
// withdraw argents
    public void withdraw(){
        System.out.println("enter your trading Number");
        int Number = sc.nextInt();
        Trader trader = null;
        for(Trader trader1 : traderlist){
            if(trader1.getTraderNum() == Number){
                trader = trader1;
            }
        }
        if(trader != null){
            System.out.println("how much you wanna Withdraw ");
            double montant = sc.nextDouble();
            if(montant > trader.getSold_initial()){
                System.out.println("votre sold est insuffusant!!");
            }else if(montant > 1){
                System.out.println("vous entrer une null valeur!!");
            }
            else{
                trader.setSold_initial(montant);
                System.out.println("Operation Made successfully !!");
                System.out.println("your withdraw " + montant + "$");
            }
        }else {
            System.out.println("trader not found");
        }
    }

}




