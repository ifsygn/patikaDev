package Java102.AdventureGame.Location;

import Java102.AdventureGame.Inventory;
import Java102.AdventureGame.Player.Player;

abstract class NormalLoc extends Location {

    public NormalLoc() {

    }

    NormalLoc(Player player, Location location) {

    }

    public boolean onLocation() {
        return true;
    }
}

