package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class Game {
    private SecretNumberGenerator secretNumber;
    private boolean complete = false;
    private Scanner scanner = new Scanner(System.in);

    public Game() {
        secretNumber = new SecretNumberGenerator();
    }

    public void start() {
        int guess;
        System.out.println("Take a guess!!");

        while(!complete) {
            guess = scanner.nextInt();
            processGuess(guess);
        }
        System.out.println("You got it!");
    }

    private void processGuess(int guess) {
        if(guess == secretNumber.getNumber()) {
            complete = true;
        } else {
            printHint(guess);
            System.out.println("Try again!");
        }
    }

    private void printHint(int guess) {
        if(guess > secretNumber.getNumber()) {
            System.out.println("Too high!!");
        } else {
            System.out.println("Too low!!");
        }
    }
}
