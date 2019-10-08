package Exercises;

import java.util.Scanner;

public class ArrayMethodDemo {

    public static void main(String[] args){

        int[] intArray = new int[10];
        int userEntry;
        int count = 0;
        boolean quit = true;

        Scanner input = new Scanner(System.in);

        while(quit){

            if(count == 10)
                quit = false;
            else{
                System.out.println("Enter integer number " + (count + 1) + ">>>> ");
                userEntry = input.nextInt();
                intArray[count] = userEntry;
                count++;
            }
        }
        System.out.println("The integers entered are: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        reverseDisplay(intArray);
        sumDisplay(intArray);
        lesserDisplay(intArray);
        averageDisplay(intArray);
    }
    public static void reverseDisplay(int[] intArray){

        System.out.println("The integers in reversed order are:");
        for(int i = 9; i >= 0; i--){
            System.out.println(intArray[i]);
        }
    }
    public static void sumDisplay(int[] intArray){

        int total = 0;

        for(int i = 0; i < intArray.length; ++i){
            total = total + intArray[i];
        }
        System.out.println("The total of all your numbers is: \n" + total);
    }
    public static void lesserDisplay(int[] intArray){

        int limitValue;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a limiting value for your integers>>>> ");
        limitValue = input.nextInt();

        System.out.println("The numbers less than " + limitValue + " are:");
        for(int i = 0; i < intArray.length; ++i){
            if(intArray[i] < limitValue){
                System.out.println(intArray[i]);
            }
        }
    }
    public static void averageDisplay(int[] intArray){

        int average;
        int total = 0;

        for(int i = 0; i < intArray.length; ++i){

            total = total + intArray[i];
        }
        average = total/intArray.length;

        System.out.println("The average of your numbers is " + average + "\nThe list of numbers above it is:");
        for(int j = 0; j < intArray.length; ++j){
            if(intArray[j] > average){
                System.out.println(intArray[j]);
            }
        }

    }
}
