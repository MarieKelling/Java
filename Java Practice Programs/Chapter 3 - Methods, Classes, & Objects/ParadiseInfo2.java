import java.util.Scanner;																									//Creating a static method that accepts arguments and returns a value
public class ParadiseInfo2																							
{

	public static void main(String[] args)
	{
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);															//Scanner object used for input
		
		System.out.print("Enter cutoff price for discount -- ");											//Prompts for the minimum discount price
		price = keyboard.nextDouble();
		System.out.print("Enter discount rate as a whole number -- ");								//Prompts for the discount rate 
		discount = keyboard.nextDouble();
		
		displayInfo();
		savings = computeDiscountInfo(price, discount); 												    //Assigns savings the value of the method's returned value of savings
		
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That's a savings of at least $" + savings);

	}
	
	public static void displayInfo()
	{
		System.out.println("Paradise Day Spa wants to pamper you.");
		System.out.println("We will make you look good.");
	}
	
	public static double computeDiscountInfo(double Price, double Discount)		//price & discount values are passed as the arguments for this method
	{
		double savings;
		savings = Price * Discount / 100;
		return savings;
	}
}