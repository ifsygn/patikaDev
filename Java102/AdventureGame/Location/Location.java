package Java102.AdventureGame.Location;

import Java102.AdventureGame.Player.Player;

import java.util.Scanner;

public abstract class Location {
    public static Scanner sc = new Scanner(System.in);
    public Player player;
    public String name;

    public Location() {

    }

    Location(Player player, Location location) {

    }

    //
    private boolean onLocation() {

        return true;
    }
}