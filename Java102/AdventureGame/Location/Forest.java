package Java102.AdventureGame.Location;

import Java102.AdventureGame.Obstacle.Vampire;
import Java102.AdventureGame.Player.Player;

public class Forest extends BattleLoc {

    Forest() {

    }

    public Forest(Player player) {
        super();
    }

    public void onLocation(Player player) {
        player.inventory.firewoord = true;
        System.out.println("You are in the Forest.");
        Vampire vampire = new Vampire();
        random.nextInt();

        obstacle = vampire;

        System.out.println("Do you want to combat with " + obstacle.getName());
        if (sc.nextBoolean())
            combat(player, vampire);
    }
}
