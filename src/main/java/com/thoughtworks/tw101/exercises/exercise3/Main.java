package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();

        Integer sum = oddSum.of(1, 4);
        Integer sum1 = oddSum.of(4, 5);
        Integer sum2 = oddSum.of(4, 7);
        Integer sum3 = oddSum.of(8, 5);

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
