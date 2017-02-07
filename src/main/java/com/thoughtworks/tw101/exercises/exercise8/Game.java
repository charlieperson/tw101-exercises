package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.SecretNumberGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    private boolean complete = false;
    SecretNumberGenerator secretNumber;
    private ArrayList<Integer> guessRecord = new ArrayList<>();

    public Game() {
        secretNumber = new SecretNumberGenerator();
    }

    public void start() {
        System.out.println("Take a guess");
        int guess;

        while(!complete) {
            guess = scanner.nextInt();
            processGuess(guess);
        }
        System.out.println("Got it!!!");
        printGuessRecord();
    }

    private void processGuess(int guess) {
        guessRecord.add(guess);
        if(guess == secretNumber.getNumber()) {
            complete = true;
        } else {
            printHint(guess);
            System.out.println("Try again!");
        }
    }

    private void printHint(int guess) {
        if(guess > secretNumber.getNumber()) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }

    private void printGuessRecord() {
        System.out.println("Here are all of your guesses: ");
        for(Integer guess : guessRecord) {
            System.out.println(guess);
        }
    }
}

