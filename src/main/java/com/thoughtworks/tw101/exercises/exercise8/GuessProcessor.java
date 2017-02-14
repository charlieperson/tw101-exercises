package com.thoughtworks.tw101.exercises.exercise8;

public class GuessProcessor {

    public static int secretNumber;
    private boolean foundNumber = false;

    public GuessProcessor(int number) {
        secretNumber = number;
    }

    public void processGuess(int guess) {
        printResult(guess);
        if(!foundNumber) System.out.println("Try again!");
    }

    private void printResult(int guess) {
        if(guess > secretNumber) {
            System.out.println("Too high!");
        } else if(guess < secretNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Got it!");
            foundNumber = true;
        }
    }

}
