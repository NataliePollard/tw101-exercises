package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        double randDouble = Math.random();
        int rand = (int)(randDouble*100);

        System.out.println("Guess a number between 1 and 100");

        String guess = getUserInput();

        int max = 100;
        int min = 1;
        NumberChecker check = new NumberChecker(rand, min, max);
        while(!check.checkNumber(guess)) {
            guess = getUserInput();
        }
    }

    private static String getUserInput(){
        String inputLine = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }


}
