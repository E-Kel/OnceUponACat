package onceUponACat.cat;

abstract public class Cat {
    protected String breed;
    protected String name;

    public Cat(String breed, String name) {
        setBreed(breed);
        setName(name);
    }
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String stringReplyFormat(String str) {
        str = "[" + str + "]: ";
        return str;
    }


}


