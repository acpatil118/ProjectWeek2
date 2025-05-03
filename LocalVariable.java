package BasicJavaProgram;

public class LocalVariable {

    // Static method without functionality
    static void add() 
    {
        
    }

    // Instance variables
    int a1 = 10;
    int b = 20;
    // Non-static method Sub
    public void Sub() 
    {
        int a = 0; // Local variable inside Sub method
        System.out.println(b - a); // Prints subtraction result
    }

    public static void main(String[] args) {
        // Local variables inside main
        int a = 10;
        int b = 20;
        System.out.print(a + b); // Outputs the sum of a and b

        // Create an object to call non-static method
        LocalVariable n = new LocalVariable();
        n.Sub(); // Calls the Sub method and prints the result of b - a
    }
}

