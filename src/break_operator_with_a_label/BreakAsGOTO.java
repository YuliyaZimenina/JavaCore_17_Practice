package break_operator_with_a_label;

/*
Using the break statement with label
 */
public class BreakAsGOTO {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 4; i++) {

            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is equals " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        // This line will never be reached
                        System.out.println("Not displayed");
                    }
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After cycle for");
    }
}
