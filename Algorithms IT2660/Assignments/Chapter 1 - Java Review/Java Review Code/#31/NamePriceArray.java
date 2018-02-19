import java.util.Scanner;
public class NamePriceArray
{
	String[] name = new String[3]; 
	double[] price = new double[3];  
	Scanner scanner = new Scanner(System.in); 
	
	public void promtUser()
		{
		System.out.println("Enter the name of the first item: ");
		name[0] = scanner.nextLine();
		System.out.println("Enter the name of the second item: ");
		name[1] = scanner.nextLine();
		System.out.println("Enter the name of the third item: ");
		name[2] = scanner.nextLine();
		
		System.out.println("Enter the price of the first item: ");
		price[0] = scanner.nextDouble();
		System.out.println("Enter the price of the second item: ");
		price[1] = scanner.nextDouble();
		System.out.println("Enter the price of the third item: ");
		price[2] = scanner.nextDouble();
		}
      
    public String toString()
    {
	return("The items: " + name[0] + ", " + name[1] + ", " + name[2] + 
	  " have the prices of " + price[0] + ", " + price[1] + ", " + price[2]);   
    }

}