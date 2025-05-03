package MathisCool;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        // Calculate the area of the triangle
        double area = 0.5 * base * height;
        
        // Print the result
        System.out.println("The area of the triangle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}
