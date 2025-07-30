package play;

import player.PlayerFeatures;

public class TreasureRoom implements Room, GameObject {
    private String treasure;

    public TreasureRoom(String treasure) {
        this.treasure = treasure;
    }

    public void enter(PlayerFeatures player) { // The player can find a treasure
        System.out.println("You found a treasure! \uD83D\uDC8E");
        interact(player);
    }

    public void interact(PlayerFeatures player) { // And add the treasure into the inventory
        player.addToInventory(treasure);
    }
}