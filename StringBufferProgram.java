package BasicJavaProgram;

public class StringBufferProgram 
{

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer ("Archana R Patil");
		
		 System.out.println(s1.insert(7,  "Arch"));
		
		System.out.println(s1.replace(7, 11,  "Rai" ));
		
		System.out.println(s1.delete(7,10));
		
		System.out.println(s1.reverse());
		
		
	}

}
