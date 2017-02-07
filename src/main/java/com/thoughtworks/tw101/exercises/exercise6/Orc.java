package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    String name = "Orc";
    int hitpoints = 20;

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount;
        System.out.println(name + " just took " + amount + " damage.");
    }

    @Override
    public void reportStatus() {
        System.out.println("Monster's name: " + name);
        System.out.println("Current hit points: " + hitpoints);
    }
}
