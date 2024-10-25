package continue_operator;

/*
Using the continue statement
 */
public class ContinueOperatorDemo {
    public static void main(String[] args) {
        int i;
        // Print even numbers in the range from 0 to 100
       for (i = 0; i < 100; i++){
           if ((i%2) != 0) continue; // next iteration
           System.out.print(i + " ");
       }
    }
}
