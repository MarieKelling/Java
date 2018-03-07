import java.util.Scanner;
public class CreateSpaServices
{

	public static void main(String[] args)
	{
		String service;
		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service:  ");												
		service = keyboard.nextLine();																//Prompts & Accepts service value
		System.out.print("Enter price:  $"); 
		price = keyboard.nextDouble();															//Prompts & Accepts price value 
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		
		/*keyboard.nextLine();															//Removes enter key left over from last numeric entry
		System.out.print("Enter service:  ");
		service = keyboard.nextLine();
		System.out.print("Enter price:  $");										//COMMENTED OUT TO SEE USE OF DEFAULT CONSTRUCTOR IN SPASERVICE.JAVA
		price = keyboard.nextDouble();
		secondService.setServiceDescription(service);
		secondService.setPrice(price);							*/ 
		
		System.out.println("First service details: ");											//Displays service & price 
		System.out.println(firstService.getServiceDescription() + " $" +			
										firstService.getPrice());
		System.out.println("Second serivce details: ");
		System.out.println(secondService.getServiceDescription() + " $" +
										secondService.getPrice());
		
	}
}