package Java102.AdventureGame.Player;

import Java102.AdventureGame.*;
import Java102.AdventureGame.Location.Location;
import Java102.AdventureGame.Obstacle.Obstacle;

public abstract class Player {
    public Inventory inventory;
    private String ID;
    private int damage;
    private int health;
    private String name;
    private int money;

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
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
        System.out.println(this.name + " ile " + obstacle.getName() + " karşı karşıya!");

        while (this.getHealth() != 0 || obstacle.getHealth() != 0) {

            obstacle.setDamage(-this.getDamage());
            System.out.println(this.getName() + " " + obstacle.getName() + " canavarına saldırdı.\n" +
                    this.damage + "hasar verdi.\n" + "Canavarın canı " + obstacle.getHealth() + " kaldı.");

            if (obstacle.getHealth() == 0) {
                System.out.println("Savaşı " + this.name + " kazandı.");
                break;
            }

            this.setHealth(obstacle.getDamage());
            System.out.println(this.getName() + " " + obstacle.getName() + " oyuncusuna saldırdı.\n" +
                    this.damage + "hasar verdi.\n" + "Canavarın canı " + obstacle.getHealth() + " kaldı.");
        }
    }

    public void selectChar() {

    }
}
