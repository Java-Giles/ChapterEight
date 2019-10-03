package Exercises;

import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args){


        double userEntry = 0.0;
        int count = 0;
        double total = 0.0;
        double average;
        double[] twentyDoubles = new double[count];

        Scanner input = new Scanner(System.in);

        while(userEntry != 99999){
            System.out.println("Enter double number " + (count + 1) +  ":");
            userEntry = input.nextDouble();
            twentyDoubles[count] = userEntry;
            ++count;
            total = total + userEntry;
        }

    }
}
