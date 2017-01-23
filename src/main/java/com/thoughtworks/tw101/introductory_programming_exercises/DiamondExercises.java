package com.thoughtworks.tw101.introductory_programming_exercises;


import org.apache.commons.lang3.StringUtils;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(17);
        drawADiamond(11);
        drawADiamondWithYourName(11, "Charlie");
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int numberOfSpaces = n-1;
        for(int i=1; i<=n; i++) {
            String stars  = StringUtils.repeat("*", ((i*2)-1));
            String spaces = StringUtils.repeat(" ", numberOfSpaces--);
            System.out.println(spaces + stars);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawUpsideDownIsoscelesTriangle(int n, int indentation) {
        int numberOfSpaces = indentation;
        for(int i=n; i>=0; i--) {
            String stars  = StringUtils.repeat("*", ((i*2)-1));
            String spaces = StringUtils.repeat(" ", numberOfSpaces++);
            System.out.println(spaces + stars);
        }
    }

    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawUpsideDownIsoscelesTriangle(n-1, 1);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n, String name) {
        drawAnIsoscelesTriangle(n-1);
        System.out.println(name);
        drawUpsideDownIsoscelesTriangle(n-1, 0);
    }
}
