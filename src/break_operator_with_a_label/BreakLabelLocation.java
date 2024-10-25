package break_operator_with_a_label;

/*
Program execution depending on the location of the break statement label
 */
public class BreakLabelLocation {
    public static void main(String[] args) {
        int x = 0, y = 0;

        // The label is located before the for statement
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; x < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println("********************************");
        // The label is located immediately before {
        for (x = 0; x < 5; x++)
            stop2:{
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}
