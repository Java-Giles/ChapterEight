package Exercises;

import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args){


        double userEntry = 0.0;
        int count = 1;
        double total = 0.0;
        double average = 0;
        double high = 0;
        double highDistance = 0;
        double low = 999999;
        double lowDistance = 0;
        double distanceNum;
        double[] twentyDoubles = new double[20];

        Scanner input = new Scanner(System.in);

        while(userEntry != 99999) {
                System.out.println("Enter double number " + (count) +  ":");
                userEntry = input.nextDouble();

            if(userEntry != 99999){
                count++;
                twentyDoubles[count] = userEntry;
                total = total + userEntry;
                if(userEntry > high){
                    high = userEntry;
                }
                else if(userEntry < low){
                    low = userEntry;
                }
            }

            else{
                System.out.println("Ending code...");
            }
            average = total / count;
            highDistance = high - average;
            lowDistance = (low - (low * 2) + average);


        }
        System.out.println("Your entered values are:");
        for(int i = 2; i < count + 1; ++i){
            System.out.println(twentyDoubles[i]);
        }
        if(highDistance > lowDistance){
            distanceNum = high;
            System.out.println("The average of your numbers is " + average +
                    ". \nThe number furthest from the average is " + distanceNum + ", with a distance of " + highDistance);
        }
        else{
            distanceNum = low;
            System.out.println("The average of your numbers is " + average +
                    ". \nThe number furthest from the average is " + distanceNum + ", with a distance of " + lowDistance);
        }


    }
}
