package com.company;

public class WildCat extends Cat implements Playable {
    public void hatePeople(){
        System.out.println("hate");

    }
    public void saveWorld(){
        System.out.println("save");
    }

    @Override
    public void play() {
        System.out.println("To play with pigeon");
    }
}
