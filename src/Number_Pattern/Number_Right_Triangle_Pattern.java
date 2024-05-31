package Number_Pattern;

public class Number_Right_Triangle_Pattern {
    // java program to print number right triangle pattern

    public static void main(String[]args) {
        // variable that holds which values be printed
        int number;
        // rows to be printed
        int n = 10;

        // outer loop for the rows
        for (int i = 0; i <n; i++) {
            number = 1;

            // inner loop for the columns
            for (int j = 0; j <=i; j++) {
                // prints the number
                System.out.print(number+ " ");

                // increments the number
                number++;
            }
            // throws the cursor to the next line after printing each row
            System.out.println();
        }
    }

}
