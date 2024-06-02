package Number_Pattern;

public class Number_Pattern_Six {
    // java program to print number pattern
    public static void main(String[] args){

        // calling method
        numberPattern();
    }

    public static void numberPattern(){
        int rows = 10;

        // outer loop for rows
        for(int i = 1; i <= rows; i++){

            // inner loop for columns
            for(int j = i; j >= 1; j--){
                System.out.print(j+ "");
            }
            System.out.println();
        }

    }
}
