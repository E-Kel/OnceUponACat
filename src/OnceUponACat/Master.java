package OnceUponACat;

import static OnceUponACat.Const.moodMax;

public class Master {

    String name;
    int amountOfMoney;
    int mood;
    String spoilShoesPhrase;
    String outOfMoneyPhrase;


    public Master(String name, int amountOfMoney, int mood, String spoilShoesPhrase, String outOfMoneyPhrase) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.mood = mood;
        this.spoilShoesPhrase = spoilShoesPhrase;
        this.outOfMoneyPhrase = outOfMoneyPhrase;
    }

    public void getMood() {
        String moodStr;
        if (mood < 4) {
            System.out.println(name + ": " + "I'm so Angry!");
        } else if (mood >= 7) {
            System.out.println(name + ": " + "I'm so happy! And I'm feeling great\n");
        }
    }


    public void increaseMood() {
        mood += 2;
        if (mood >= moodMax) {
            mood = 10;
        }
        getMood();
    }


    public void decreaseAmountOfMoney() {
        amountOfMoney -= 10;
        if (amountOfMoney <= 0) {
            System.out.println(name + ": " + outOfMoneyPhrase);
        }

    }


}
