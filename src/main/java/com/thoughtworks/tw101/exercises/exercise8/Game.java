package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class Game {
    private SecretNumberGenerator secretNumber;
    private ArrayList<Integer> guessRecord = new ArrayList<>();
    private int currentGuess = -1;
    private GuessProcessor guessProcessor;


    public Game() {
        secretNumber = new SecretNumberGenerator();
        guessProcessor = new GuessProcessor(secretNumber.getNumber());
    }

    public void start() throws NumberFormatException {
        System.out.println("Take a guess");
        while (numberHasNotBeenGuessed()) {
            currentGuess = GuessCollector.collectValidGuess();
            addGuessToRecord();
            guessProcessor.processGuess(currentGuess);
        }
        VictoryHandler.printGuessRecord(guessRecord);
    }

    private void addGuessToRecord() {
        guessRecord.add(currentGuess);
    }

    private boolean numberHasNotBeenGuessed() {
        return currentGuess != secretNumber.getNumber();
    }
}

