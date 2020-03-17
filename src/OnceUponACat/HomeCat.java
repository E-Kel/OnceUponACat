package OnceUponACat;

public class HomeCat extends Cat implements Playable {
    Master master;
    String playPhrase;
    String spoilShoesPhrase;
    String layOnSofaPhrase;

    public HomeCat(String breed, String name, Master master, String playPhrase, String spoilShoesPhrase, String layOnSofaPhrase) {
        super(breed, name);
        this.master = master;
        this.playPhrase = playPhrase;
        this.spoilShoesPhrase = spoilShoesPhrase;
        this.layOnSofaPhrase = layOnSofaPhrase;
    }


    public void layOnSofa() {
        master.increaseMood();
        System.out.println(name + ": " + layOnSofaPhrase);
    }

    public void spoilShoes() {
        System.out.println(stringReplyFormat(name) + spoilShoesPhrase);
        System.out.println(master.name + ": " + master.spoilShoesPhrase);
        master.decreaseAmountOfMoney();
    }

    @Override
    public void play() {
        System.out.println(name + ": " + playPhrase);
        master.increaseMood();
    }
}
