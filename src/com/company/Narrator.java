package com.company;

public class Narrator {


    public void tellphrase(Master who, String phrase){
        System.out.println(who.name+": "+phrase);
    }
    public void tellphrase(Cat who, String phrase){
        System.out.println(who.getName()+": "+phrase);
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
                "\n\n" +
                "\n There was a good wild cat named Luke Skywalker that lived on the planet Tatuin." +
                "\n He was on by itself, but sometimes he dreamed about travel among the stars." +
                "\n One peaceful day The Dart Wader - sith cat has come by Imperial Warship to Tatuin" +
                "\n to find lost schemas of Starkiller - the powerful Imperial's weapon, " +
                "\n but after he hasn't found them he had been destroyed the Luke's homeland village" +
                "... ");

    }

    public void DartWaderAndPalpatin(Master palpatin, HomeCat DW) {
        System.out.println("\n===Chapter 1===\n(Emperor's flagship)\n");
        DW.layOnSofa();
        tellphrase(palpatin, "Come to me, my little kitty, I have a mission for you.");
        DW.spoilShoes();
        tellphrase(palpatin, "Stop it! I want to tell you something. Come here!");
        tellphrase(DW, "{Comming up to Palpatin}");
        tellphrase(palpatin, "So, I need you to find plans of DEATH STAR at the Rebel Planet.\n" +
                " Our spy send the message that they are hidden at the Tatuin. \n" +
                "I want you to destroy a Rebel base and bring back the plans. \n If you succeed, I'll teach you how to create thunders.\n " +
                "If not ... You will regret about that! Understood? ");
        tellphrase(DW, "Meow! {xooooo-khhhhhhhh}");

    }

    public void LukeAndYoda(Master yoda, WildCat luke) {
        System.out.println("\n===Chapter 2===\n(Tatuin)\n");
        tellphrase("\n There was a good wild cat named Luke Skywalker that lived on the planet Tatuin." +
                "\n\nThere was usual morning in the Luke's village. But suddenly, he have heard that somebody in the yard. ");
        luke.hatePeople();
        tellphrase(luke, "Who is there? ");
        tellphrase("There was Master Yoda, legendary Jedi Master ");



    }
    public void LukeAndDartWader(WildCat luke, HomeCat DW) {
    }

    public void DartWaderDestroyPalpatin(Master palpatin, HomeCat darthWader, WildCat luke) {

    }


}
