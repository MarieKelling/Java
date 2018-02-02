public class TricStudentDatabase 
{
	public static void main(String[] args)
	{
		StudentOperations tricDatabase = new StudentOperations();
		Student temp; 
		
		//Test of the constructor 
		Student Marie = new Student("Marie", "1", "3.8");
		Student Nate = new Student("Nate", "1", "3.5");
		Student Donnie = new Student("Donnie", "3", "3.0");
      Student John = new Student("John", "4", "4.0");  
		
		//System.out.println(Marie.toString());
		//System.out.println(Nate.toString());
		//System.out.println(Donnie.toString()); 
		
		//Test of the Insert & Fetch methods 
		System.out.println("**************TEST OF INSERT & FETCH METHODS**************");
		System.out.println(tricDatabase.insert(Marie));
		System.out.println(tricDatabase.insert(Nate));
		
		System.out.println(tricDatabase.fetch("Marie"));
		System.out.println(tricDatabase.fetch("Nate"));
		System.out.println(tricDatabase.fetch("Donnie")); 

		temp = tricDatabase.fetch("Nate");
		System.out.println(temp.toString());
		
		System.out.println(tricDatabase.insert(Donnie));
		
		temp = tricDatabase.fetch("Donnie");
		System.out.println(temp.toString());
		
		System.out.println("**************TEST OF DELETE METHOD**************");
		System.out.println(tricDatabase.delete("Marie"));
		System.out.println(tricDatabase.fetch("Marie"));
		
		
		System.out.println("**************TEST OF UPDATE METHOD**************");
		System.out.println(tricDatabase.insert(Marie));
		System.out.println(tricDatabase.insert(John));
		System.out.println(tricDatabase.update("John", Marie)); 
		System.out.println(tricDatabase.fetch("John")); 		
		
	}


}