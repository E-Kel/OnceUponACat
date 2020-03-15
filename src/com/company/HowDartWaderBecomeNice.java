package com.company;

public class HowDartWaderBecomeNice {

    public static void main(String[] args) {
        Master LukeSkywalker = new Master("Luke Skywalker", 30, 5);
        Master DartWader = new Master("Dart Wader", 100, 1);

        WildCat Progue = new WildCat();

        HomeCat R2D2 = new HomeCat();
        HomeCat BB8 = new HomeCat();

        Narrator narrator = new Narrator();

        narrator.intro();
        narrator.LukeAndYoda();
        narrator.DartWaderAndPalpatin();
        narrator.LukeAndDartWader();
        narrator.DartWaderDestroyPalpatin();

    }
}
