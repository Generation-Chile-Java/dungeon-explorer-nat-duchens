package player;

import java.util.ArrayList;
import java.util.List;

public class PlayerFeatures {
    private String name;
    private int health;
    private List<String> inventory;

    public PlayerFeatures(String name, int health) { // Player has name and initial hit points
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(name + " took " + amount + " damage. Remaining health: " + health);
    }

    public void addToInventory(String item) {
        inventory.add(item);
        System.out.println(name + " picked up: " + item);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStatus() {
        System.out.println("Player: " + name + " | Health: " + health + " | Inventory: " + inventory);
    }
}