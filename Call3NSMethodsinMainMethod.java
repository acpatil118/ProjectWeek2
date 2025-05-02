package BasicJavaProgram;

public class Call3NSMethodsinMainMethod 
{

	void name()
	
 {
			System.out.println("Archana");
			
	}

	void surname()
	{
		System.out.println("Patil");
	
	}
	
	void age()
	{
		System.out.println("X");
	}

	public static void main(String[] args) 
	
	//create an object
	//Class Name variable  = new Class name
	{
	
		Call3NSMethodsinMainMethod n = new Call3NSMethodsinMainMethod  (); 
		//Create an Object
		Call3NSMethodsinMainMethod n1 = new Call3NSMethodsinMainMethod ();
		Call3NSMethodsinMainMethod n2 = new Call3NSMethodsinMainMethod ();
	
	n.name();
	
	n1.surname();	
	
	n2.age();
	
}
		
		
 }