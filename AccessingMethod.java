package BasicJavaProgram;

public  class AccessingMethod 
{
static void add()
{
	add();
	Sub();
	
	System.out.println("Adding");
}


	public static void main(String[] args) 
	{
		

	System.out.println("I am the main Method");
} 
    static void Sub()
    {
    	System.out.println("Substration");
    	add();
    	Sub();
    	
	}
	

}
