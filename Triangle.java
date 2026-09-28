import java.util.Scanner;
/**
 * Creates a triangle object that stores the triangle's name, base, and height and calculates its area.
 * @author Jacob Patterson jpatterson@student.sdccd.edu
 * @version 1.0
 * @since 10/1/2026
 */
public class Triangle
{
        private String name;
    private double base;
    private double height;

    /**
     * Creates a Triangle with default values.
     */
    public Triangle()
    {
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }
    /**
     * Creates a Triangle with a specified name, base, and height.
     * @param inName the name of the triangle
     * @param inBase the base of the triangle
     * @param inHeight the height of the triangle
     */
    public Triangle(String inName, double inBase, double inHeight)
    {
        name = inName;
        base = inBase;
        height = inHeight;
    }
    /**
     * Displays the triangle's name, base, height, and area.
     */
    public void writeOutput()
    {
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is: %.1f%n", getArea());
    }
    /**
     * Gets the triangles name, base, and height from the user.
     */
    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the triangles name: ");
        name = keyboard.nextLine();

        System.out.print("What is the triangles base: ");
        base = keyboard.nextDouble();

        System.out.print("What is the triangles height: ");
        height = keyboard.nextDouble();
    }
    /**
     * Sets the name of the triangle.
     * @param newName the new name of the triangle
     */
    public void setName(String newName)
    {
        name = newName;
    }
    /**
     * sets the base of the triangle
     * @param newBase the new base of the triangle
     */
    public void setBase(double newBase)
    {
        base = newBase;
    }
    /**
     * Sets the height of the triangle
     * @param newHeight the new height of the triangle
     */
    public void setHeight(double newHeight)
    {
        height = newHeight;
    }
    /**
     * Calculates the area of the triangle
     * @return the area of the triangle
     */
    private double getArea()
    {
        return 0.5 * base * height;
    }
}