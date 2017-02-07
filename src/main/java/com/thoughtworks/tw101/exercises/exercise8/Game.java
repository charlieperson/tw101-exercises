package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.SecretNumberGenerator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    private boolean complete = false;
    SecretNumberGenerator secretNumber;
    private ArrayList<Integer> guessRecord = new ArrayList<>();
    private int currentGuess = -1;
    private boolean currentGuessIsValid;


    public Game() {
        secretNumber = new SecretNumberGenerator();
    }

    public void start() throws InputMismatchException {
        System.out.println("Take a guess");
        while(!complete) {
            validateGuess();
            if(currentGuessIsValid) {
                addGuessToRecord();
                processGuess();
            }
        }
        handleVictory();
    }

    private void validateGuess() {
        try {
            currentGuess = scanner.nextInt();
            currentGuessIsValid = true;
        } catch(Exception ex) {
            currentGuessIsValid = false;
            System.out.println("Please be sure to enter a valid integer value");
        } finally {
            scanner.nextLine();
        }
    }

    private void addGuessToRecord() {
        guessRecord.add(currentGuess);
    }

    private void processGuess() {
        if(currentGuess == secretNumber.getNumber()) {
            complete = true;
        } else {
            printHint();
            System.out.println("Try again!");
        }
    }

    private void printHint() {
        if(currentGuess > secretNumber.getNumber()) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }

    public void handleVictory() {
        System.out.println("Got it!!!");
        printGuessRecord();
    }

    private void printGuessRecord() {
        System.out.println("Here are all of your guesses: ");
        for(Integer guess : guessRecord) {
            System.out.println(guess);
        }
    }
}

