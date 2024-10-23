package echo_speed;

/*
Calculate the distance to a large object based
on the echo arrival time.
The speed of sound propagation through the air approximately
335 meters per second. The time interval is 11.6 second
 */

public class EchoSpeed {
    public static void main(String[] args) {
        double distance;
        distance = (11.6 * 335) / 2; // Distance calculation
        System.out.println("The distance to a large object is " + distance + " meters");
    }
}
