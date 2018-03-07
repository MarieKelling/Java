import java.util.Scanner;
public class CreateSpaServices2
{

	public static void main(String[] args)
	{
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		
		firstService = getData(firstService);
		secondService = getData(secondService);		
		
		System.out.println("First service details: ");											//Displays service & price 
		System.out.println(firstService.getServiceDescription() + " $" +			
										firstService.getPrice());
		System.out.println("Second serivce details: ");
		System.out.println(secondService.getServiceDescription() + " $" +
										secondService.getPrice());
		
	}
	
	public static SpaService getData(SpaService ss)										//Method accepts & returns SpaService argument/object
	{
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service:  ");												
		service = keyboard.nextLine();																//Prompts & Accepts service & price value
		System.out.print("Enter price:  $"); 
		price = keyboard.nextDouble();		
		keyboard.nextLine();
		
		ss.setServiceDescription(service);
		ss.setPrice(price);
		return ss;
	}
	
}