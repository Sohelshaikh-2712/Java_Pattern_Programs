package Number_Pattern;

import java.util.Scanner;

public class Number_Pattern_Five {
    // java program to print number triangle pattern with user input

    public static void main(String[]args){

        // calling method
        numberPattern();
    }

    public static void numberPattern(){

        // defining scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows you want to print: ");
        int rows = input.nextInt();

        // outer loop for rows
        for(int i = 1; i <= rows; i++){

            // inner loop for columns
            for(int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
