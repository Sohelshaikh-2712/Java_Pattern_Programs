package Number_Pattern;

public class Number_Right_Triangle_Pattern_Two {
    // java program to print the number pattern with numbers
    // incrementing on each column

    public static void main(String[] args){
        // calling the numberPattern method
        numberPattern();


    }
    public static void numberPattern(){
        int n = 5;
        int number = 1;
        // outer loop for rows
        for(int i = 0; i < n; i++){

            // inner loop for columns
            for(int j = 0; j < i + 1; j++){
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
