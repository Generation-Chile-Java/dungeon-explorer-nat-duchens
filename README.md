[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/vov8w5Ad)

# 🧩 Dungeon Exploration Game - Java OOP

## 🎯 Exercise Objective

Develop a dungeon exploration game in Java that uses the **four pillars of object-oriented programming**: **encapsulation**, **inheritance**, **polymorphism**, and **abstraction**.  
The game should include classes, interfaces, and interaction between different types of objects within the dungeon.

---

## 🕹️ Game Description

The player must explore a dungeon composed of different types of rooms.  
Each room can be empty, contain a treasure, or host an enemy.  
The player must navigate through these rooms, collect objects, and face enemies, all while trying to stay alive.

---

## 📜 Game Rules

1. The player starts with a name and an initial amount of health points → `PlayerFeatures` ✅
2. The player can move through multiple rooms in the dungeon → `Main`, using a `switch-case` inside a `while` loop ✅
3. Rooms can be of three types: empty, with treasure, or with an enemy → `EmptyRoom`, `TreasureRoom`, and `EnemyRoom` ✅
4. The player can collect treasures that are added to their inventory → `TreasureRoom` and `PlayerFeatures` ✅
5. The player can take damage from enemies and lose health points → `EnemyRoom` and `PlayerFeatures` ✅
6. The game ends when the player has explored all the rooms or has lost all their health points → `PlayerFeatures` and `Main` ✅

---

## 🛠️ Technical Requirements

1. **Interfaces and Abstraction**: Define interfaces for rooms and interactable objects in the game.
2. **Encapsulation**: Use private attributes and public methods to handle the state of the player and the rooms.
3. **Inheritance**: Create concrete classes that implement the defined interfaces to represent different types of rooms.
4. **Polymorphism**: Use interface references to manage the different types of rooms and objects in the game.

---

## 📋 Detailed Specifications

### Step 1: Create the basic interfaces
- Define a `Room` interface to represent a room in the dungeon.
- Define a `GameObject` interface to represent interactable objects in the dungeon.

### Step 2: Create the Player class
- Define a `Player` class that encapsulates the player's data and behavior.
- The class should include attributes such as `name`, `health`, and `inventory`.
- Provide methods that allow the player to take damage, collect items, and display their current status.

### Step 3: Create concrete Room classes
- Create an `EmptyRoom` class to represent an empty room.
- Create a `TreasureRoom` class to represent a room with a treasure.
- Create an `EnemyRoom` class to represent a room with an enemy.

### Step 4: Create the main game class
- Define a main class that initializes the player and a sequence of rooms.
- Implement a loop that allows the player to move through the rooms.
- Handle player interactions with rooms and objects.

---

## 🧩 Additional Instructions

- Make sure to properly handle the interactions between the player and the different room types.
- Consider adding more rooms and enemies to make the game more engaging.
- You may implement additional features such as allowing the player to use items from the inventory.
