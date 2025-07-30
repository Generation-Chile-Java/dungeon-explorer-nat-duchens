package play;

import player.PlayerFeatures;

public class EmptyRoom implements Room { // Just and empty place
    public void enter(PlayerFeatures player) {
        System.out.println("You entered an empty room \uD83E\uDEE5");
    }
}
