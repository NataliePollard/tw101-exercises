package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by nataliepollard on 12/22/15.
 */
public class Troll implements Monster {
    private int hitPoints = 40;
    private String name = "Troll";
    @Override
    public void takeDamage(int amount) {
        hitPoints -= (amount/2);

    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name + " Current Hit Points: " + hitPoints);

    }
}
