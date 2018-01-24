import java.util.Scanner;
public class NamePrice
{
	String name;
	double price; 
	Scanner scanner = new Scanner(System.in);
	
	public void promtUser()
		{
		System.out.println("Enter the name of the item: ");
		name = scanner.nextLine();
		System.out.println("Enter the price of the item: ");
		price = scanner.nextDouble();
		}
      
    public String toString()
    {
      return("The item," + name + ", costs " + price);  
    }

}