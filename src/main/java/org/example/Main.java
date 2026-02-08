package org.example;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
  static TradingPlatform tradingPlatform = new TradingPlatform("Ecrypto","www.ecrypto.com");

    public static void x_Trade(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("##################### X-Trade #####################");
            System.out.println("1. Admin Mode");
            System.out.println("2. Client Mode");
            System.out.println("3. Gestion Filtrage and trier");
            System.out.println("4. Close");
            System.out.println("###################################################");
            System.out.println("Make ur choise : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1 :
                    adminMenu();
                    break;
                case 2 :
                    traderMenu();
                    break;
                case 3 :
                    gestion_filtrage();
                    break;
                default:
                    System.out.println("invalid Input !!");
                    break;

            }
        }while(choice != 0);


    }

    public static void gestion_filtrage(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("##################### Gestion Filtrage and trier #####################");
            System.out.println("1. transaction de Trader");
            System.out.println("2. Filtrer les transactions par : type (BUY / SELL)");
            System.out.println("3. Trier les transactions par : date, montant");
            System.out.println("4. Calcul du volume total échangé par trader");
            System.out.println("5. Calc_total_ordres_passes");
            System.out.println("6. Close");
            System.out.println("###################################################");
            System.out.println("Make ur choise : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1 :
                    tradingPlatform.transaction_de_Trader();
                    break;
                case 2 :
                   tradingPlatform.filter_Transaction();
                    break;
                case 3 :
                   tradingPlatform.filter_Transaction_BY_Date_Montant();
                    break;
                case 4:
                    tradingPlatform.calcVolumeParActif();
                    break;
                case 5:
                    tradingPlatform.Calc_total_ordres_passes();
                    break;
                default:
                    System.out.println("invalid Input !!");
                    break;

            }
        }while(choice != 0);


    }

    // ADMIN MENU
    public static void adminMenu() {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("################### Admin Mode ##################");
            System.out.println("1. Afficher Traders");
            System.out.println("2. Ajouter un Trader");
            System.out.println("3. Afficher Actifs");
            System.out.println("4. Ajouter Actif");
            System.out.println("5. Afficher Historique Transactions");
            System.out.println("5. Go back Home");
            System.out.println("#################################################");
            System.out.println("Make ur choise : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                   tradingPlatform.afficher_Traders();
                    break;
                case 2:
                    tradingPlatform.add_Trader();
                    break;
                case 3:
                   tradingPlatform.afficher_Actif();
                    break;
                case 4:
                   tradingPlatform.add_Actif();
                    break;
                case 5:
                   tradingPlatform.display_Transactions();
                    break;
                case 6:
                    x_Trade();
                    break;
                default:
                    System.out.println("invalid Input !!");
                    break;
            }

        } while (choice != 0);
    }


    // Trader MENU
    public static void traderMenu() {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("################### Admin Mode ##################");
            System.out.println("1. deposit money");
            System.out.println("2. withdraw money");
            System.out.println("3. achter un actif");
            System.out.println("4. vendre un actif");
            System.out.println("5. Afficher portfolio");
            System.out.println("6. get back Home");
            System.out.println("#################################################");
            System.out.println("Make ur choise : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tradingPlatform.deposit();
                    break;
                case 2:
                    tradingPlatform.withdraw();
                    break;
                case 3:
                    tradingPlatform.acheter_Actif();
                    break;
                case 4:
                    tradingPlatform.vendre_Actif();
                    break;
                case 5:
                    tradingPlatform.afficher_Trader_Transaction();
                    break;
                case 6:
                    x_Trade();
                    break;
                default:
                    System.out.println("invalid Input !!");
                    break;
            }

        } while (choice != 0);
    }
    public static void main(String[] args) throws ParseException {
        //*********************************************
      x_Trade();

        //*********************************************

        }
    }
