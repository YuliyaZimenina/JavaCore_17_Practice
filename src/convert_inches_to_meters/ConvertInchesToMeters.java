package convert_inches_to_meters;
/*
Print a table of conversions from inches to meters.
Length conversions are displayed up to 12 feet, every inch.
Print a blank line every 12 inches.
(One meter is approximately 39.37 inches)
 */

public class ConvertInchesToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;

        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // Convert inches to meters
            System.out.println(inches + " inches equals " + meters + " meters");
            counter++;

            //After every 12th line we output empty line
            if (counter == 12) {
                System.out.println();
                counter = 0; // Reset counter
            }
        }
    }
}
