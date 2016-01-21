//Jason Burnell
//CSC 164
//Gradebook Project

package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double[][] testscores = {
                {60, 65, 70},
                {70, 75, 80},
                {80, 85, 90},
                {90, 95, 100}
        };

        for (int column = 0; column < testscores[0].length; column++) {
            double total = 0;
            for (int row = 0; row < testscores.length; row++)
                total += testscores[row][column];
            double average = total / 4;
            System.out.println("Average Score for Test " + (column + 1) + " is " + average + "%");
        }
        System.out.println();
        for (int column = 0; column < testscores.length; column++) {
            double totalt = 0;
            for (int row = 0; row < testscores[0].length; row++)
                totalt += testscores[column][row];
            double average = totalt / 3;
            System.out.println("Average score for student " + (column + 1) + " is " + average + "%");
        }
    }
}

