
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan =  new Scanner (System.in);
        int[] score =  new int[5];
        score[0] = 22;
         score[1] = 22;
          score[2] = 22;
           score[3] = 22;
            score[4] = 22;
            System.out.println(Arrays.toString(score));
            System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);

    }
}
