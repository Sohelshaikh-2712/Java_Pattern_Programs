package Number_Pattern;

public class Number_Pyramid_Pattern {
    // java program to print number pyramid
    public static void main(String[] args){
        // calling the pyramidPattern method
        pyramidPattern();

    }
    // method for pyramid pattern

    public static void pyramidPattern(){
        int rows = 7; // number of rows to print

        // outer loop for rows
        for(int i = 0; i < rows; i++){
            int number = 1;

            System.out.printf("%" + (rows-i) * 2 + "s", "");

            // inner loop for columns
            for(int j = 0; j<= i; j++){
                System.out.printf("%4d", number);

                number = number * (i - j) / (j + 1);

            }
            System.out.println();
        }
    }
}
