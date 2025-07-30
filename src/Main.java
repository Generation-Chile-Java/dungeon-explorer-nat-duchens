import play.*;
import player.PlayerFeatures;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create player
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        PlayerFeatures player = new PlayerFeatures(name, 100);

        // Create 3x3 dungeon grid
        Room[][] dungeon = {
                { new EmptyRoom(), new TreasureRoom("Golden Key \uD83D\uDD11"), new EnemyRoom(20) },
                { new EnemyRoom(15), new EmptyRoom(), new TreasureRoom("Health Potion \uD83C\uDFFA") },
                { new EmptyRoom(), new EnemyRoom(25), new TreasureRoom("Magic Scroll \uD83D\uDCDC") }
        };

        int x = 1, y = 1; // Start at center (1,1)
        System.out.println("\nYou start in the center of the dungeon (1,1).");

        while (player.isAlive()) { // The player can move between rooms, but if his/her life decrease the game end
            System.out.println("\nCurrent position: (" + x + "," + y + ")");
            dungeon[y][x].enter(player);
            player.showStatus();

            System.out.print("\nMove (W/A/S/D): ");
            String input = scanner.nextLine().toUpperCase();

            switch (input) { // The player can move between rooms
                case "W": if (y > 0) y--; else System.out.println("You hit a wall! \uD83E\uDDF1"); break;
                case "S": if (y < dungeon.length - 1) y++; else System.out.println("You hit a wall! \uD83E\uDDF1"); break;
                case "A": if (x > 0) x--; else System.out.println("You hit a wall!"); break;
                case "D": if (x < dungeon[0].length - 1) x++; else System.out.println("You hit a wall! \uD83E\uDDF1"); break;
                default: System.out.println("Invalid input! Use W/A/S/D only.");
            }

            // Optional: I tried to end the game if all rooms are visited or any other condition
        }

        System.out.println("\nGame over! \uD83E\uDD90");
        scanner.close();
    }
}
