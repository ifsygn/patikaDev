package Java102.AdventureGame.Location;

import Java102.AdventureGame.Inventory;
import Java102.AdventureGame.Player.Player;

public class ToolStore extends NormalLoc {
    Inventory inventory;


    public ToolStore() {
        inventory = new Inventory();
        menu();
    }

    public ToolStore(Player player) {
        super();
        //...
    }


    public ToolStore(Player player, Location location) {

    }

    public boolean onLocation() {

        return true;
    }

    //menu shows the tools in the inventory.
    public void menu() {

    }

    public void buy() {

    }
}

