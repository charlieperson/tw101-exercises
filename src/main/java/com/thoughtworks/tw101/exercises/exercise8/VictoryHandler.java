package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class VictoryHandler {

    public static void printGuessRecord(ArrayList<Integer> guessRecord) {
        System.out.println("Here are all of your guesses: ");
        for(Integer guess : guessRecord) {
            System.out.println(guess);
        }
    }
}
