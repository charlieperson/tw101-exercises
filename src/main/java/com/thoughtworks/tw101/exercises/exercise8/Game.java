package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.SecretNumberGenerator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    SecretNumberGenerator secretNumber;
    private ArrayList<Integer> guessRecord = new ArrayList<>();
    private int currentGuess = -1;
    private boolean currentGuessIsValid;
    private GuessProcessor guessProcessor;


    public Game() {
        secretNumber = new SecretNumberGenerator();
        guessProcessor = new GuessProcessor(secretNumber.getNumber());
    }

    public void start() throws InputMismatchException {
        System.out.println("Take a guess");
        while(currentGuess != secretNumber.getNumber()) {
            validateGuess();
            if(currentGuessIsValid) {
                addGuessToRecord();
                guessProcessor.processGuess(currentGuess);
            }
        }
        VictoryHandler.handleVictory(guessRecord);
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
}

