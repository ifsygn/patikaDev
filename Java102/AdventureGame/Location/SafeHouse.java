package Java102.AdventureGame.Location;

import Java102.AdventureGame.Player.Player;

public class SafeHouse extends NormalLoc {

    SafeHouse(Player player, Location location) {
        super(player, location);
    }

    public boolean onLocation() {

        return true;
    }
}
