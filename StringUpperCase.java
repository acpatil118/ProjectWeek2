package BasicJavaProgram;

public class StringUpperCase {

	public static void main(String[] args) 
	{
		  String a = "School";
		  int length=a.length (); //Length
		  System.out.println(length);
		  
		  String a1 = a.toUpperCase();//UpperCase
		  System.out.println(a1);
		  String b="ARCHANA PATIL";
		  String b1 = b.toLowerCase();//LowerCase
		  System.out.println(b1);
		  
		  String c = "  ARCHANA PATIL   ";
		 String c1 = c.trim();  //Trim
		 
		 System.out.println(c1);
		 
		 String D = "  ARCHANA PATIL   ";
		 char D1 = D.charAt(length);  //CharAt
		 System.out.println(D1);
		 
		 
	}

}
