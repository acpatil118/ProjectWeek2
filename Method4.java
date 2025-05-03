package BasicJavaProgram;

public class Method4  
{
	Method4 (int a)
	{
		System.out.println("1");
	}
	Method4()
	{
		this(10);
		System.out.println("2");
	}
	Method4 (String Name)
	{
		this();
		System.out.println("3");
	}
	
	public static void main(String[] args) 
	{
		
		new Method4();
		
		
		}

	}

