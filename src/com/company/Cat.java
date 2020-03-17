package com.company;

abstract public class Cat {
    String breed;

    public String getName() {
        return name;
    }

    String name;

    public Cat(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }
    public String stringReplyFormat(String str){
        str = "["+str+"]: ";
        return str;
    }


}


