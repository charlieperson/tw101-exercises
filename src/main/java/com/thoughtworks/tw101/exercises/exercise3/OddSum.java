package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public int of(int start, int end) {
        int count = start;
        int sum = 0;

        while(count < end) {
            if(count % 2 == 1) sum += count;
            count++;
        }
        return sum;
    }
}
