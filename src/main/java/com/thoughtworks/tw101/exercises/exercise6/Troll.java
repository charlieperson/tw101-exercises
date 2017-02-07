package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    String name = "Troll";
    int hitpoints = 40;

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount/2;
        System.out.println(name + " just took " + (amount/2) + " damage.");
    }

    @Override
    public void reportStatus() {
        System.out.println("Monster's name: " + name);
        System.out.println("Current hit points: " + hitpoints);
    }
}
