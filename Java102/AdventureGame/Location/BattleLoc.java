package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Obstacle;
import Java102.AdventureGame.Player.Player;
import java.util.Random;


abstract class BattleLoc extends Location {
    static Random random = new Random();
    public Obstacle obstacle;
    public Player player;

    BattleLoc() {

    }

    BattleLoc(Obstacle o) {

    }

    public void onLocation(Player player) {
        this.player = player;
    }

    //TODO: savaşma metodu
    public void combat(Player player, Obstacle obstacle) {
        this.obstacle = obstacle;
        player.combat(obstacle);
    }
}

