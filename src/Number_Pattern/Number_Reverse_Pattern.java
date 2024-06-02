package Number_Pattern;

public class Number_Reverse_Pattern {
    // java program to print reverse number triangle pattern
    public static void main(String[] args){

        // calling method
        reversePattern();
    }

    public static void reversePattern(){
        int rows = 10;
        // outer loop for rows
        for(int i = rows; i >= 1; i--){

        // inner loop for columns
        for(int j = rows; j >= i; j--){
            System.out.print(j+ " ");
        }
        System.out.println();

        }
    }
}
