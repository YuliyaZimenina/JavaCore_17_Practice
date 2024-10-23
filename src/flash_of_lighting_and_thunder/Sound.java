package flash_of_lighting_and_thunder;

/*
Calculating the distance between the observer and the
location of the lighting flash.
The speed of sound propagation through the air approximately
335 meters per second. The time interval is 7.2 second
 */

public class Sound {
    public static void main(String[] args) {
        double distance;
        distance = 7.2 * 335; // Distance calculation
        System.out.println("The location of the lightning flash is " + distance +
                " meters away");
    }
}
