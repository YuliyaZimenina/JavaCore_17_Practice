package find_simple_numbers;

/*
Find all prime numbers from 2 to 100
 */
public class SimpleNumbers {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        for (i = 2; i < 100; i++) {
            isPrime = true;
            // Checking if a number is divisible without a reminder
            for (j = 2; j <= i / j; j++)
                //If it's divisible, this number isn't prime
                if ((i % j) == 0) isPrime = false;
                if (isPrime) System.out.println("The prime number: " + i);
        }
    }
}

