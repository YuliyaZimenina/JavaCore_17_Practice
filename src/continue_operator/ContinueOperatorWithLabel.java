package continue_operator;
/*
Using the continue statement with label
 */
public class ContinueOperatorWithLabel {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop passage #" + i +
                    ", inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerLoop; // continue outer loop
                System.out.print(j);
            }
        }
    }
}
