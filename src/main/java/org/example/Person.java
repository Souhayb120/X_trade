package org.example;

public class Person {
    private int id;
    private String nom;
    private int age;
    static private int conter = 1;


    public Person( String nom, int age) {
        this.id = conter++;
        this.nom = nom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
