package MathisCool;

import java.util.Scanner;  // Import the Scanner class

public class CircumferanceOfSqure 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        
        // Calculate the circumference (perimeter) of the square
        double circumference = 4 * side;
        
        // Print the circumference of the square
        System.out.println("The circumference (perimeter) of the square is: " + circumference);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}