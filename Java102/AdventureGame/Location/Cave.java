package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Zombie;

public class Cave extends BattleLoc {

    Cave() {
        Zombie zombie = new Zombie();
        new Cave(zombie);
    }

    Cave(Zombie zombie) {

    }
}
