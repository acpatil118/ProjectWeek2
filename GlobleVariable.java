package BasicJavaProgram;

public class GlobleVariable
{
    static double salary = 9000; // Static global variable
    double pi = 3.14; // Non-static global variable (initialized with a value)
	public char[] a;

   
    void add() 
    {
        System.out.println("Addition result");
    }

    public static void main(String[] args) {
        // Accessing static global variable directly in the main method
        System.out.println("Salary: " + salary);

        // Creating an object to access non-static global variable 'pi'
        GlobleVariable n = new GlobleVariable();
        double pi2 = n.pi; // Access non-static variable 'pi' through the object
        System.out.println("Pi value: " + pi2);

        // Local variables inside the main method
        int a = 10; // Local variable
        int b = 20;
        System.out.println("Subtraction Result: " + (b - a)); // Prints subtraction result

        // Calling the add() method to demonstrate instance method usage
        n.add();  // Output: Addition result: 18014.14 (assuming salary + pi)
    }

	public void man() {
		
		
	}
}