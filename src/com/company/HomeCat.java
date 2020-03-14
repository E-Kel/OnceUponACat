package com.company;

public class HomeCat extends Cat implements Playable {
    Master master;

    public void layOnSofa(){
        System.out.println("LAAAAAAAY!!");
    }
    public void spoilShoes(){
        System.out.println("Damn! It will costs me 10$, freaking cat!!!");
        master.decreaseAmountOfMoney();
    }

    @Override
    public void play() {
        System.out.println("To play with unknown crappy thing!");
        master.mood+=1;
    }
}
