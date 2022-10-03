package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Vampire;

public class Forest extends BattleLoc {

    Forest() {
        Vampire vampire = new Vampire();
        new Forest(vampire);
    }

    Forest(Vampire vampire) {

    }
}
