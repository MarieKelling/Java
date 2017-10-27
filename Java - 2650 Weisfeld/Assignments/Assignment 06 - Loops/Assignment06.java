public class Assignment06 
{
	
	public static void main(String args[]) 
	{
																															
		Factorial factorial = new Factorial();															// Create a Factorial object
																												
		int myint = factorial.getInt();																	// Obtain an integer from the console
																												
		System.out.println("Factorial of " + myint + " is: " +								// Calculate the factorial of the number 
		factorial.calc_factorial(myint)); 

	}
	
}