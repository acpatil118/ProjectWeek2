package BasicJavaProgram;

public class StringEqualsEqualsIgnoreCase {

	public static void main(String[] args) 
	{
		String str1 = "Enjoy Your Class";
		String str2 = "enjoy your class";
		String str3 = "Enjoy Your Class";
		
		if (str1.equals(str2))
		{
			System.out.println("str1 is equal to str2 using equals()");
		}
		else 
		{
			System.out.println("str1 is NOT equal to str2 using equals()");
		}
			
		if(str1.equals(str3))
		{
			System.out.println("str1 is equal to str2 using equals()");
		}
			
		else
			
		{
			System.out.println("str1 is equal to str2 using equals()");
		}
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("str1 is equal to str2 using equalsignore()");
		}
			
		else
			
		{
			System.out.println("str1 is Not equal to str2 using equals()");
		}
	}

}
