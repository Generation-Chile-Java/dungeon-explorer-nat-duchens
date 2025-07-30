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

    public void takeDamage(int amount) { // The payer can receive damage and decrease health
        health -= amount;
        System.out.println(name + " took " + amount + " damage \uD83D\uDC94. Remaining health: " + health + " \uD83D\uDC96");
    }

    public void addToInventory(String item) { // The player can add items, such as treasures
        inventory.add(item);
        System.out.println(name + " picked up: " + item);
    }

    public boolean isAlive() {
        return health > 0;
    } // If health decreases bellow 0 the game ends

    public void showStatus() { // To see the items in the inventory
        System.out.println("Player: " + name + " | Health: " + health + " | Inventory: " + inventory);
    }
}