package com.company;

public class Narrator {

    Master palpatin = new Master("Sheev Palpatine", 30, 5, "Oh, I feel my force is melting...", "I Have Died Before. I'll be baaaaack!!! (Died)");
    Master yoda = new Master("Yoda", 20, 5, "", "Do or Do not! There is no try! You have a sist...hhh(Died) ");

    WildCat luke = new WildCat("JediCat", "Luke Skywalker", "hate", "play", "save");
    WildCat porg = new WildCat("Porg de Jaku", "Porg", "hate", "play", "save");

    HomeCat darthWader = new HomeCat("SithCat", "Darth Wader", palpatin,"play", "spoil", "layonsofa");
    HomeCat snoke = new HomeCat("SithCat", "Supreme Leader Snoke", palpatin,"play", "spoil", "layonsofa");

    public void tellphrase(Master who, String phrase){
        System.out.println(who.getName()+phrase);
    }
    public void tellphrase(Cat who, String phrase){
        System.out.println(who.getName()+phrase);
    }
    public void tellphrase(String phrase){
        System.out.println("Narrator: "+phrase);
    }

    public void intro() {
        tellphrase("A long time ago in a galaxy far, far away... " +
                "Rebel spaceships, striking\n" +
                "from a hidden base, have won\n" +
                "their first victory against\n" +
                "the evil Galactic Empire.\n" +
                "\n" +
                "During the battle, Rebel\n" +
                "spies managed to steal secret\n" +
                "plans to the Empire's\n" +
                "ultimate weapon, the DEATH\n" +
                "STAR, an armored space\n" +
                "station with enough power to\n" +
                "destroy an entire planet.\n" +
                "\n" +
                "Pursued by the Empire's\n" +
                "sinister agents, Princess\n" +
                "Leia races home aboard her\n" +
                "starship, custodian of the\n" +
                "stolen plans that can save\n" +
                "her people and restore\n" +
                "freedom to the galaxy....." +
                "\n There was a good wild cat named Luke Skywalker that lived on the planet Tatuin." +
                "\n He was on by itself, but sometimes he dreamed about travel among the stars." +
                "\n One peaceful day The Dart Wader - sith cat has come by Imperial Warship to Tatuin" +
                "\n to find lost schemas of Starkiller - the powerful Imperial's weapon, " +
                "\n but after he hasn't found them he had been destroyed the Luke's homeland village" +
                "... ");

    }

    public void DartWaderAndPalpatin() {
        darthWader.spoilShoes();
        snoke.play();
        snoke.layOnSofa();

    }

    public void LukeAndYoda() {
    }
    public void LukeAndDartWader() {
    }

    public void DartWaderDestroyPalpatin() {

    }


}
