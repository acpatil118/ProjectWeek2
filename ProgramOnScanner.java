package BasicJavaProgram;

import java.util.Scanner;

public class ProgramOnScanner {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your name: ");
			sc.nextLine();

			System.out.print("Enter your age: ");
			sc.nextInt();
		}


	}

}
