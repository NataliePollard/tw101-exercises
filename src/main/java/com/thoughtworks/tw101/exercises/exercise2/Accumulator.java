package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int count;
    public Accumulator() {
        count = 0;
    }

    public void increment() {
        count +=1;

    }

    public void total() {
        System.out.println(count);
    }
}
