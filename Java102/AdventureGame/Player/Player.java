package Java102.AdventureGame.Player;

import Java102.AdventureGame.*;
import Java102.AdventureGame.Location.Location;
import Java102.AdventureGame.Obstacle.Obstacle;

public abstract class Player {
    public Inventory inventory;
    private String ID;
    private int damage;
    private int startHealth;
    private int health;
    private String name;
    private int money;

    Player() {
        inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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
        this.damage = damage + inventory.weaponDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStartHealth() {
        return this.startHealth;
    }

    protected void setStartHealth(int health) {
        this.startHealth = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void move(Location location) {

    }

    //Player Obstacle ile savaşır, damage ve health ile kazanan belli olur.
    public void combat(Obstacle obstacle) {
        System.out.println(this.getName() + " ile " + obstacle.getName() + " karşı karşıya!");

        while (this.getHealth() > 0 && obstacle.getHealth() > 0) {

            obstacle.setHealth(obstacle.getHealth() - this.getDamage());
            System.out.println(this.getName() + " " + obstacle.getName() + " canavarına saldırdı.\n" +
                    this.getDamage() + " hasar verdi.\n" + "Canavarın canı " + obstacle.getHealth() + " kaldı.");

            if (obstacle.getHealth() <= 0) {
                System.out.println("Savaşı " + this.getName() + " kazandı.");
                break;
            }

            this.setHealth(this.getHealth() - obstacle.getDamage());
            System.out.println(obstacle.getName() + " " + this.getName() + " oyuncusuna saldırdı.\n" +
                    obstacle.getDamage() + " hasar verdi.\n" + "Oyuncunun canı " + this.getHealth() + " kaldı.");
        }
    }

    public void selectChar() {

    }
}
