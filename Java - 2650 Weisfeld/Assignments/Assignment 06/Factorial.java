import java.util.Scanner;
public class Factorial 
{

	public int calc_factorial(int f)
	{
	    int factor = 1;
		for (int i = 1; i <= f; i++)											//for loop calculates the factorial 
		{
			factor *= i;
        }
		return factor;
	}
	
	public int getInt()
	{ 	
		int userInt;
		
		Scanner inputRetrieval = new Scanner(System.in);
		System.out.print("Enter an Integer:  ");
	    userInt = inputRetrieval.nextInt();
		
		return userInt; 
	}
	
} 