package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

public class RandomNumberGenerator {
    private static int number = generate();

    public static int getNumber() {
        return number;
    }

    private static int generate() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        return randomInt;
    }
}
