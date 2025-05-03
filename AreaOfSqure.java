package MathisCool;

import java.util.Scanner;  // Import the Scanner class

public class AreaOfSqure 
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        
        // Calculate the area of the square
        double area = side * side;
        
        // Print the area of the square
        System.out.println("The area of the square is: " + area);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
