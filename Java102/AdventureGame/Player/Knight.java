package Java102.AdventureGame.Player;

public class Knight extends Player {

    public Knight() {
        setName("Knight");
        setID("P3");
        setDamage(8);
        setHealth(24);
        setMoney(5);

        System.out.println("Seçtiğiniz karakter: " + getName());
    }
}