package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Obstacle;
import Java102.AdventureGame.Player.Player;

abstract class BattleLoc extends Location {
    public Obstacle obstacle;

    BattleLoc() {

    }

    BattleLoc(Obstacle o) {

    }

    public boolean onLocation() {

        return true;
    }

    //savaşma metodu
    public void combat(Player player) {
        player.combat(obstacle);
    }
}

