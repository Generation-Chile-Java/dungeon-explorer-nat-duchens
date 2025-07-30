// src/play/EnemyRoom.java
package play;

import player.PlayerFeatures;

public class EnemyRoom implements Room, GameObject {
    private int damage;

    public EnemyRoom(int damage) {
        this.damage = damage;
    }

    public void enter(PlayerFeatures player) {
        System.out.println("An enemy appears!");
        interact(player);
    }

    public void interact(PlayerFeatures player) {
        player.takeDamage(damage);
    }
}
