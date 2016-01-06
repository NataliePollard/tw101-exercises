package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by nataliepollard on 12/22/15.
 */
public class Orc implements Monster{
    private int hitPoints = 20;
    private String name = "Orc";

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name + " Current Hit Points: " + hitPoints);

    }
}
