package BasicJavaProgram;

//Parent Class

class Person 
{
	    void displayInfo() 
	    {
	        System.out.println("I am a girl.");
	    }

		public void Running() 
		{// TODO Auto-generated method stub
			
		}
	    
	}

//Child class

class Student extends Person 

{
  void study() 
  
  {
      System.out.println("I am studying.");
  }
  
}
//Main class

public class InheritanceDemo

{
	
 public static void main(String[] args)
 
 {
     Student s1 = new Student();

     s1.displayInfo(); // Method from Person class (inherited)
     s1.study();       // Method from Student class
 }
 
}



