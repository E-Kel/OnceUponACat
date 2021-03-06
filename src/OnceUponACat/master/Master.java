package onceUponACat.master;

import static onceUponACat.master.Const.MOOD_MAX;

public class Master {

    private String name;
    private int amountOfMoney;
    private int mood;
    private String spoilShoesPhrase;
    private String outOfMoneyPhrase;

    public Master(String name, int amountOfMoney, int mood, String spoilShoesPhrase, String outOfMoneyPhrase) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.mood = mood;
        this.spoilShoesPhrase = spoilShoesPhrase;
        this.outOfMoneyPhrase = outOfMoneyPhrase;
    }

    public void getMood() {
        if (mood < 4) {
            System.out.println(name + ": " + "I'm so Angry!");
        } else if (mood >= 7) {
            System.out.println(name + ": " + "I'm so happy! And I'm feeling great\n");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getSpoilShoesPhrase() {
        return spoilShoesPhrase;
    }

    public void setSpoilShoesPhrase(String spoilShoesPhrase) {
        this.spoilShoesPhrase = spoilShoesPhrase;
    }

    public String getOutOfMoneyPhrase() {
        return outOfMoneyPhrase;
    }

    public void setOutOfMoneyPhrase(String outOfMoneyPhrase) {
        this.outOfMoneyPhrase = outOfMoneyPhrase;
    }

    public void increaseMood() {
        mood += 2;
        if (mood >= MOOD_MAX) {
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
