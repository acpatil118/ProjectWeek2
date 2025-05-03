package MathisCool;

import java.util.Scanner;  // Import the Scanner class

public class CircumfranceofTriangle
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the three sides of the triangle
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        
        // Calculate the perimeter (circumference) of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Output the perimeter
        System.out.println("The perimeter (circumference) of the triangle is: " + perimeter);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
