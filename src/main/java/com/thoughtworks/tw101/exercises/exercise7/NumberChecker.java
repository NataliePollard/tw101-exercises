package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by nataliepollard on 12/23/15.
 */
public class NumberChecker {
    private int number, min, max;
    public NumberChecker(int number, int min, int max) {
        this.number = number;
        this.min = min;
        this.max = max;
    }

    public boolean checkNumber(String guessSting) {

        int guess = Integer.parseInt(guessSting);

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
            return true;
        }
    }
}
