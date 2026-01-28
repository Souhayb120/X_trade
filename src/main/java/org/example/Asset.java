package org.example;

public class Asset {
        private String name;
        private int code;
        private double prix;
        private int quantite;
        private String type_Actif;


        public Asset(String name,int code, double prix,String type_Actif, int quantite) {
           this.name = name;
            this.code = code;
            this.prix = prix;
            this.quantite = quantite;
            this.type_Actif = type_Actif;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        public String getType_Actif() {
            return type_Actif;
        }

        public void setType_Actif(String type_Actif) {
            this.type_Actif = type_Actif;
        }
    }


