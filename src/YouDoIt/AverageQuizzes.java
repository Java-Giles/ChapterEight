package YouDoIt;

import java.util.Scanner;

public class AverageQuizzes {

    public static void main(String[] args) {

        int[] scoresArray = new int[10];
        int score;
        int count = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i< scoresArray.length; ++i){
            System.out.println("Enter quiz score number " + (i + 1) + ">>>> ");
            score = input.nextInt();
            scoresArray[i] = score;
            total = scoresArray[i] + total;

        }
        System.out.println("The scores entered were:");
        for(int j = 0; j < scoresArray.length; ++j){
            System.out.println(scoresArray[j]);
        }
        System.out.println("The average is " + (total/scoresArray.length));
        HighLow.displayHighLow(scoresArray);
    }
}
