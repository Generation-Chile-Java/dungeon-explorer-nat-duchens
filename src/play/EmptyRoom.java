package play;

import player.PlayerFeatures;

public class EmptyRoom implements Room {
    public void enter(PlayerFeatures player) {
        System.out.println("You entered an empty room.");
    }
}
