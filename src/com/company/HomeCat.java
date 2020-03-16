package com.company;

public class HomeCat extends Cat implements Playable {
    Master master;
    String playPhrase;
    String spoilShoesPhrase;
    String layOnSofaPhrase;

    public HomeCat(String breed, String name, Master master, String playPhrase, String spoilShoesPhrase, String layOnSofaPhrase) {
        super(breed, name);
        this.master = master;
        this.playPhrase = playPhrase;
        this.spoilShoesPhrase = spoilShoesPhrase;
        this.layOnSofaPhrase = layOnSofaPhrase;
    }


    public void layOnSofa() {
        master.increaseMood();
        System.out.println(layOnSofaPhrase);
    }

    public void spoilShoes() {
        master.decreaseAmountOfMoney();
        System.out.println(spoilShoesPhrase);
    }

    @Override
    public void play() {
        master.mood += 1;
        System.out.println(playPhrase);
    }
}
