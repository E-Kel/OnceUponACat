package com.company;

public class Master {
    static int moodMax = 10;
    static int moodMin = 0;
    static int amountOfMoneyMax = 100;
    static int amountOfMoneyMin = 0;


    public Master(String name, int amountOfMoney, int mood)
    {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.mood = mood;
        System.out.println(String.format("Hey! I'm %S! ", this.name));
    }
    public void getMood(){
        String moodStr;
        if (mood < 4){
            System.out.println("I'm so Angry!");
        }
        else if (mood >= 7){
            System.out.println("I'm happy! And I'm feeling great\n");
        }
    }
    String name;
    int amountOfMoney;
    int mood;
    public void decreaseAmountOfMoney(){
        amountOfMoney-=10;
    }
}
