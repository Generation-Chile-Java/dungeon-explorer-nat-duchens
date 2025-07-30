# 🧩 Dungeon Explorer Game (Java OOP)

## 🎯 Objective

This project is a simple **dungeon exploration game** developed in Java, designed to demonstrate the **four pillars of Object-Oriented Programming (OOP)**:

- 🧱 Encapsulation
- 🧬 Inheritance
- 🔁 Polymorphism
- 🧠 Abstraction

The game includes multiple room types, interactable objects, and a player that explores the dungeon while collecting treasures and facing enemies.

---

## 🕹️ Game Description

The player explores a dungeon made up of different rooms. Each room can be:

- 🕳️ Empty
- 💰 Contain a treasure
- 🐉 Contain an enemy

The player collects items, fights enemies, and must try to survive until all rooms have been explored or health reaches zero.

---

## 📜 Game Rules

- The player starts with a name and initial health points.
- The player moves through a sequence of rooms using menu options.
- Each room may trigger a specific interaction:
    - Treasure → added to inventory
    - Enemy → causes damage
    - Empty → no effect
- The game ends if:
    - The player dies (health = 0)
    - All rooms have been explored

---

## 🛠️ Technical Requirements

- **Encapsulation:** Player data and room states are managed through private fields and public methods.
- **Inheritance & Polymorphism:** Room types (`EmptyRoom`, `TreasureRoom`, `EnemyRoom`) implement a common `Room` interface.
- **Abstraction:** Interactions with rooms are managed through the `Room` interface and `GameObject` abstraction.
- **Interfaces:** Used to handle all room types and interactive items generically.

---

## 🧱 Project Structure

```plaintext
/src
├── main/
│ ├── play/
│ │ └── Main.java
│ ├── player/
│ │ └── PlayerFeatures.java
│ ├── dungeon/
│ │ ├── Room.java # Interface
│ │ ├── EmptyRoom.java
│ │ ├── TreasureRoom.java
│ │ └── EnemyRoom.java
│ └── items/
│ ├── GameObject.java # Interface
│ └── [additional items]
```
