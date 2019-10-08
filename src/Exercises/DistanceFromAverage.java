package Exercises;

import java.util.Scanner;

import static java.lang.Math.abs;

public class DistanceFromAverage {

    public static void main(String[] args) {


        double userEntry = 0;
        int count = 0;
        double total = 0.0;
        double average = 0;
        double distance;
        double[] twentyDoubles = new double[20];
        boolean quit = true;

        Scanner input = new Scanner(System.in);

        while (quit) {
            System.out.println("Please enter a number>>>> ");
            userEntry = input.nextDouble();
            if (count == 20)
                quit = false;
            else if (userEntry == 99999)
                quit = false;
            else {
                twentyDoubles[count] = userEntry;
                total = total + userEntry;
                count++;
            }
        }
        average = total/count;

        for(int i = 0; i < count; i++){
            distance = twentyDoubles[i] - average;
            System.out.println("The average was " + average + " \nUser entry was " + twentyDoubles[i] +
            "\nThe distance was " + abs(distance));

        }
        System.out.println("Total count was " + count);
    }
}
