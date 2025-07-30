// src/play/EnemyRoom.java
package play;

import player.PlayerFeatures;

public class EnemyRoom implements Room, GameObject {
    private int damage;

    public EnemyRoom(int damage) {
        this.damage = damage;
    }

    public void enter(PlayerFeatures player) { // The player can find enemies
        System.out.println("An enemy appears! \uD83E\uDE7B");
        interact(player);
    }

    public void interact(PlayerFeatures player) { // The player can receive damage
        player.takeDamage(damage);
    }
}
