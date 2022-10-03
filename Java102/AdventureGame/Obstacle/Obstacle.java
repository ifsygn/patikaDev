package Java102.AdventureGame.Obstacle;

public class Obstacle {
    private String ID;
    private int damage;
    private int health;
    private String name;
    private int money;

    Obstacle() {

    }

    //Kaç tane canavarın yaratıldığını hesaplar.
    public int obstacleNumber() {

        return 0;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

