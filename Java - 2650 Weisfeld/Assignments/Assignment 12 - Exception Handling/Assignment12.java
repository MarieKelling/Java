public class Assignment12 
{
	 public static void main(String[] args) 
	 {

		 int a=0,b=0,c=0;
		 System.out.println("Assignment 12");
		 a=10;
		 
		try
		{
			c = a/b;
		}
		catch(ArithmeticException exception)
		{
			System.out.println("Arithmetic Exception was caught. Error Message: " + exception.getMessage());
		}
		 System.out.println("We are exiting gracefully");

	 }
}