package org.example;

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
            System.out.println("3. Close");
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
    };


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
    };
    public static void main(String[] args) {
        //*********************************************
          x_Trade();
        //*********************************************

        }
    }
