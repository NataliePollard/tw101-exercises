package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int totalWidth = 1 + 2*(n-1);
        for(int currentRow = 0; currentRow < n; currentRow++) {
            int numStars = 1+(2*currentRow);
            horizontalLineWithCenteredStars(numStars,totalWidth);
            System.out.println();
        }
    }

    private static void horizontalLineWithCenteredStars(int numStars, int lineWidth) {
        int numberOfBlanks = (lineWidth - numStars)/2;

        for(int i = 0; i < numberOfBlanks; i++) {
            System.out.print(" ");
        }
        for(int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
        for(int i = 0; i < numberOfBlanks; i++) {
            System.out.print(" ");
        }
    }


    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        UpsideDownIsocelesTriangle(n);

    }
    private static void UpsideDownIsocelesTriangle(int n) {
        int totalWidth = 1 + 2*(n-1);
        for(int currentRow = n-2; currentRow >= 0; currentRow--) {
            int numStars = 1 + 2 * currentRow;
            horizontalLineWithCenteredStars(numStars, totalWidth);
            System.out.println();
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int totalWidth = 1 + 2*(n-1);
        for(int currentRow = 0; currentRow < n-1; currentRow++) {
            int numStars = 1 + (2 * currentRow);
            horizontalLineWithCenteredStars(numStars, totalWidth);
            System.out.println();
        }
        System.out.println("Natalie");
        UpsideDownIsocelesTriangle(n);
    }
}
