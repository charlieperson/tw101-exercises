package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

public class SecretNumberGenerator {
    private static int number = generate();

    public int getNumber() {
        return number;
    }

    private static int generate() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        return randomInt;
    }
}
