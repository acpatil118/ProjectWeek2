package BasicJavaProgram;

public class StringBuilderProgram 
{

	public static void main(String[] args) 
	{
		
		StringBuilder s1 =new StringBuilder("Automation");  //16
		s1.append("testing");
		System.out.println(s1);
		
		String a1="Archana";
		a1.concat("Patil");
		
		System.out.println(a1);
		
		System.out.println(s1.insert(4, "API Testing"));
		
		System.out.println(s1.delete(4, 7));
		
	}

}
