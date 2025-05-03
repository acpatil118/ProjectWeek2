package MathisCool;

import java.util.Scanner;  // Import the Scanner class

public class AreaOfRectangle 
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
        
        // Calculate the area of the rectangle
        double area = length * width;
        
        // Print the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
