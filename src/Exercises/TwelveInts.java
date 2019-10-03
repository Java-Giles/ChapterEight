package Exercises;

import java.util.Scanner;

public class TwelveInts {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int count;

        int[] myArray = new int[12];

        for(int i = 0; i < myArray.length; ++i){
            System.out.println("Enter integer number " + (i+1) + ":");
            count = inp.nextInt();
            myArray[i] = count;
        }
        System.out.println();

        for(int j = 0; j < myArray.length; ++j)
            System.out.println(myArray[j]);
        for(int k = 11; k >= 0; --k)
            System.out.println(myArray[k]);

    }
}
