package Array;

import java.util.Arrays;

public class Anagram
{


	public static void main(String[] args) 
	{
		
String a1="cat";
String a2="act";

if(a1.length()!=a2.length())
{
	System.out.println("They are not anagram");
	
}
else
{
	char c1[]= a1.toCharArray();     //[m,o,m]
	char c2[]= a2.toCharArray();     //[g,o,d]
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	boolean b2=Arrays.equals(c1, c2);
	
	if(b2==true)
	{
		System.out.println("Given strings are Anagram");
		
	}
	
	else
		
	{
		System.out.println("Given stringa are not Anagram");
	}
	
}

	}
	
}
	
	


