package com.thoughtworks.tw101.exercises.exercise8;


import java.util.ArrayList;

/**
 * Created by nataliepollard on 12/23/15.
 */
public class NumberChecker {
    private int number, min, max;
    private ArrayList guessList = new ArrayList();

    public NumberChecker(int number, int min, int max) {
        this.number = number;
        this.min = min;
        this.max = max;
    }

    public boolean checkNumber(String guessSting) {
        int guess;
        try {
            guess = Integer.parseInt(guessSting);
        }
        catch (NumberFormatException e) {
            System.out.println("Guess a number");
            return false;
        }

        guessList.add(guess);

        if(guess < min || guess > max) {
            System.out.println("Guess a number in the range 1 to 100");
            return false;
        }
        else if (guess < number) {
            System.out.println("Too low!");
            return false;
        }
        else if (guess > number) {
            System.out.println("Too high!");
            return false;
        }
        else{
            System.out.println("Congradulations, you guessed the number");
            System.out.println(guessList);
            return true;
        }
    }
}