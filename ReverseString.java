package BasicJavaProgram;

public class ReverseString
{
	public static void main(String[] args)
	{
        // Initial string
        String s1 = "Start";
        
        // Method to reverse the string
        String reversedStr = reverseString(s1);
        
        // Display the reversed string
        System.out.println("Original String: " + s1);
        System.out.println("Reversed String: " + reversedStr);
    }
	public static String reverseString(String str) {
        String reversed = "";  // Initialize an empty string to hold the reversed string
        
        // Iterate over the string from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Append each character to the reversed string
        }
        
        return reversed;
    }
}
	
	


