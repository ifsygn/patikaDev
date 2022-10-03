package Java102.AdventureGame.Location;

import Java102.AdventureGame.Player.Player;

public abstract class Location {
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