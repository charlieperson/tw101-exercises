package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class GuessCollector {
    private static Scanner scanner = new Scanner(System.in);

    public static int collectValidGuess() {
        int currentGuess;
        String guess = scanner.next();
        try {
            currentGuess = Integer.parseInt(guess);
            return currentGuess;
        } catch(NumberFormatException ex) {
            System.out.println("Please be sure to enter a valid integer value");
            return collectValidGuess();
        }
    }
}
