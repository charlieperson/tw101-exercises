package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

public class SecretNumberGenerator {
    private int number = generate();

    public int getNumber() {
        return number;
    }

    private int generate() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        return randomInt;
    }
}
