package play;

import player.PlayerFeatures;

public class TreasureRoom implements Room, GameObject {
    private String treasure;

    public TreasureRoom(String treasure) {
        this.treasure = treasure;
    }

    public void enter(PlayerFeatures player) {
        System.out.println("You found a treasure!");
        interact(player);
    }

    public void interact(PlayerFeatures player) {
        player.addToInventory(treasure);
    }
}