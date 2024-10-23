package cylinder_volume;

/*
Calculate the volume of a cylinder based on the
radius of its base and height
 */
public class CylinderVolume {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        //Dynamic initialization of the volume variable
        double volume = 3.1416 * radius * height;
        System.out.println("The volume of the cylinder is " + volume);
    }
}
