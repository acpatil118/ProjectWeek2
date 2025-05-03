package BasicJavaProgram;

public class Operators 
{

static void add()
{
	System.out.println("Addition");
	int a = 10;
	int b = 20;
	int sum = a+b;
System.out.println(sum);	
}

	static void sub()
	{
		System.out.println("Substraction");
		int a = 10;
		int b = 20;
		int sub = a-b;
		
		System.out.println(sub);
	}
	
	static void mul()
	{
		System.out.println("Multiplication");
		int a = 10;
		int b = 20;
		int mul = a*b;
		System.out.println(mul);
	}
	
	static void div()
	{
		System.out.println("Division");
		int a = 20;
		int b = 10;
		int div = a/b;
		System.out.println(div);
		
	}
	
	
	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();
		
		
	}

}
