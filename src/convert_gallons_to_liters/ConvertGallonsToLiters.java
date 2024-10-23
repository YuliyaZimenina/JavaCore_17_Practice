package convert_gallons_to_liters;

public class ConvertGallonsToLiters {
    public static void main(String[] args) {
        double gallons; // The variable stores the number of gallons
        double liters; // The variable stores the result of converting gallons to liters
        int counter = 0;

        for (gallons = 1; gallons <= 100; gallons ++) {
            liters = gallons * 3.7854; // Convert gallons to liters
            System.out.println(gallons + " gallons equals " + liters + " liters");
            counter ++;
            // After ever 10 lines we output an empty line
            if(counter == 10){ // If the counter values is 10, we output an empty line
                System.out.println();
                counter = 0; // Reset counter
            }
        }
    }
}
