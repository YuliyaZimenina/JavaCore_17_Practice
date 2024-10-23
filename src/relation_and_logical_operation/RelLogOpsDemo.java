package relation_and_logical_operation;
/*
Demonstration of how relation and logical
operations work
 */
public class RelLogOpsDemo {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("It will not be executed");
        if (i >= j) System.out.println("It will not be executed");
        if (i > j) System.out.println("It will not be executed");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("It will not be executed");
        if (! (b1 & b2)) System.out.println("!(b1 & b2) give true");
        if (b1 | b2) System.out.println("b1 | b2 give true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 give true");
    }
}
