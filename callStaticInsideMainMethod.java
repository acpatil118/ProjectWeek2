package BasicJavaProgram;

public class callStaticInsideMainMethod 
{
	
		static void add()
		{
			System.out.println("Addition");
		}
		static void sub()
		{
			
			System.out.println("Substraction");
			
		}
		static void mul()
		{
			System.out.println("Multiplication");
		}
		
		public static void main(String [] args)
		{

System.out.println("Main Method");

add();
//add();
//add();
sub();
sub();
//sub();
//sub();
mul();
	}
		
}

