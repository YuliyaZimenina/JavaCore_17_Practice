package gravity_on_the_moon;
/*
The gravity on the Moon is 17% of the gravity on Earth.
Write a program to calculate the actual weight of a 49 kg
person on the Moon
 */

public class GravityOnTheMoon {
    public static void main(String[] args) {
        double humanWeight = 49.0;
        double humanWeightOnTheMoon;

        humanWeightOnTheMoon = humanWeight * 0.17;

        System.out.println("The weight of a 49 kg person on the Moon would be "
        + humanWeightOnTheMoon + " kg");
    }
}
