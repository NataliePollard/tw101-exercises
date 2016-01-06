package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.
/**
 * Created by nataliepollard on 12/23/15.
 */
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
