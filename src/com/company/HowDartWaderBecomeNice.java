package com.company;

public class HowDartWaderBecomeNice {

    public static void main(String[] args) {

        Master palpatin = new Master("Sheev Palpatine", 30, 5, "Oh, I feel my force is melting...", "I Have Died Before. I'll be baaaaack!!! (Died)");
        Master yoda = new Master("Yoda", 20, 5, "", "Do or Do not! There is no try! You have a sist...hhh(Died) ");

        WildCat luke = new WildCat("JediCat", "Luke Skywalker", "hate", "play", "save");
        WildCat porg = new WildCat("Porg de Jaku", "Porg", "hate", "play", "save");

        HomeCat darthWader = new HomeCat("SithCat", "Darth Wader", palpatin,"play", "spoil", "layonsofa");

        Narrator narrator = new Narrator();



        narrator.intro();
        narrator.LukeAndYoda(yoda, luke);
        narrator.DartWaderAndPalpatin(palpatin, darthWader);
        narrator.LukeAndDartWader(luke, darthWader);
        narrator.DartWaderDestroyPalpatin(palpatin, darthWader, luke);

    }
}
