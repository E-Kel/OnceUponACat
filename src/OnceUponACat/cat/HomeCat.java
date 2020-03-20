package onceUponACat.cat;

import onceUponACat.master.Master;

public class HomeCat extends Cat implements Playable {

    private Master master;
    private String playPhrase;
    private String spoilShoesPhrase;
    private String layOnSofaPhrase;

    public HomeCat(String breed, String name, Master master, String playPhrase, String spoilShoesPhrase, String layOnSofaPhrase) {
        super(breed, name);
        setLayOnSofaPhrase(layOnSofaPhrase);
        setSpoilShoesPhrase(spoilShoesPhrase);
        setMaster(master);
        setPlayPhrase(playPhrase);
    }


    public void layOnSofa() {
        master.increaseMood();
        System.out.println(name + ": " + layOnSofaPhrase);
    }

    public void spoilShoes() {
        System.out.println(stringReplyFormat(name) + spoilShoesPhrase);
        System.out.println(master.getName() + ": " + master.getSpoilShoesPhrase());
        master.decreaseAmountOfMoney();
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public String getPlayPhrase() {
        return playPhrase;
    }

    public void setPlayPhrase(String playPhrase) {
        this.playPhrase = playPhrase;
    }

    public String getSpoilShoesPhrase() {
        return spoilShoesPhrase;
    }

    public void setSpoilShoesPhrase(String spoilShoesPhrase) {
        this.spoilShoesPhrase = spoilShoesPhrase;
    }

    public String getLayOnSofaPhrase() {
        return layOnSofaPhrase;
    }

    public void setLayOnSofaPhrase(String layOnSofaPhrase) {
        this.layOnSofaPhrase = layOnSofaPhrase;
    }

    @Override
    public void play() {
        System.out.println(name + ": " + playPhrase);
        master.increaseMood();
    }
}
