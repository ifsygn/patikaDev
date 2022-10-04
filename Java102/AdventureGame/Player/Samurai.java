package Java102.AdventureGame.Player;

public class Samurai extends Player {

    public Samurai() {
        setName("Samurai");
        setID("P1");
        setDamage(5);
        setStartHealth(21);
        setHealth(21);
        setMoney(15);

        System.out.println("Seçtiğiniz karakter: " + getName());
    }
}