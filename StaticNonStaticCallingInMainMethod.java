package BasicJavaProgram;

public class StaticNonStaticCallingInMainMethod {

	// Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Calling the static method directly using the class name (no need for an object)
		StaticNonStaticCallingInMainMethod.staticMethod();

        // Creating an object of the class to call the non-static method
		StaticNonStaticCallingInMainMethod  obj = new StaticNonStaticCallingInMainMethod();
        obj.nonStaticMethod();
	}

}
