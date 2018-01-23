public class UsingPersonApp
{

	public static void main(String[] args)
		{
			Person Marie;											//Allocates a reference variable named Marie 
			Marie = new Person("Marie", 21, 110.5);	//Creates a Person object & places its address into the ref. var. Marie 
																				
																				
			Person Nate;
			Nate = new Person("Nate", 26, 140.7); 		
			
			
			System.out.println(Marie.toString());		//The Client specifies the object that the method is to operate on / access - 
			System.out.println(Nate.toString());				//by mentioning the object name in the method invocation statement 

			
		
		}



}