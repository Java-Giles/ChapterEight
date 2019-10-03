package GameZone;

import java.util.Random;
import java.util.Scanner;

public class FiveDice {

    public static void main(String[] args){


        Random rand = new Random();
        int diceNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("How many dice do you want to roll?");
        diceNumber = input.nextInt();

        int[] dice = new int[diceNumber];
        int total = 0;

        for( int i = 0; i < diceNumber; ++i){
            int die = rand.nextInt(6)+1;
            total = total + die;
            dice[i] = die;
            System.out.println(die);
        }
        System.out.println("The total is " + total);
    }
}
