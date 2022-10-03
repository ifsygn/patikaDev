package Java102.AdventureGame.Player;

public class Archer extends Player {

    public Archer() {
        setName("Archer");
        setID("P2");
        setDamage(7);
        setHealth(18);
        setMoney(20);

        System.out.println("Seçtiğiniz karakter: " + getName());
    }
}
