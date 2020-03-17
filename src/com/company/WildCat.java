package com.company;

public class WildCat extends Cat implements Playable {
    String hatePhrase;
    String saveTheWorldPhrase;
    String playPhrase;

    public WildCat(String breed, String name, String hatePhrase, String playPhrase, String saveTheWorldPhrase) {
        super(breed, name);
        this.hatePhrase = hatePhrase;
        this.playPhrase = playPhrase;
        this.saveTheWorldPhrase = saveTheWorldPhrase;
    }

    public void hatePeople() {
        System.out.println(name+": "+hatePhrase);

    }

    public void saveWorld() {
        System.out.println(name+": "+saveTheWorldPhrase);
    }

    @Override
    public void play() {
        System.out.println(name+": "+playPhrase);
    }
}
