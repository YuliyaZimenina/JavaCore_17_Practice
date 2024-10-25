package break_operator_with_a_label;
/*
Using the break statement with label
 */
public class BreakWithLabel {
    public static void main(String[] args) {
        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done; // Transition to the done label
                }
                System.out.println("After cycle k");  // will not be executed
            }
            System.out.println("After cycle j"); // will not be executed
        }
        System.out.println("After cycle i");
    }
}
