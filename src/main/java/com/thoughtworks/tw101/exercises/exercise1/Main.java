package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        printOddsAndSumUp(100);
    }

    public static void printOddsAndSumUp(int high) {
        int sum   = 0;
        int count = 0;

        while(count <= high) {
            if(count % 2 == 1) {
                System.out.println("Count: " + count);
                sum += count;
            }
            count++;
        }
        System.out.println("Sum = " + sum);
    }
}
