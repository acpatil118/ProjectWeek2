package MathisCool;

import java.util.Scanner;  // Import the Scanner class

public class CircumferanceOfRectangle 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        // Ask the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        // Calculate the circumference (perimeter) of the rectangle
        double circumference = 2 * (length + width);
        
        // Print the circumference (perimeter) of the rectangle
        System.out.println("The circumference (perimeter) of the rectangle is: " + circumference);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

