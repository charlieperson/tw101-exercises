package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int count;

    public void increment() {
        this.count += 1;
    }

    public void total() {
        System.out.println("Total = " + this.count);
    }
}
