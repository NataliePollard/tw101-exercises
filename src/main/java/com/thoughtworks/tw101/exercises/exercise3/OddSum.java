package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int total = 0;
        if(start%2 == 0) {
            start += 1;
        }
        for(int i = start; i < end + 1; i+=2) {
            total += i;
        }

        return total;
    }
}
