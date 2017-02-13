package com.thoughtworks.tw101.exercises.exercise8;

public class GuessProcessor {

    private int secretNumber;

    public GuessProcessor(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public void processGuess(int guess) {
        printHint(guess);
        System.out.println("Try again!");
    }

    private void printHint(int guess) {
        if(guess > secretNumber) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }

}
