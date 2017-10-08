public class Car extends Vehicle																//Allows Car Class to inherit from the Parent Class Vehicle
{
	
	private String color;
	
	public Car()		{
		
				System.out.println("Inside Car Constructor.");
		
	}
	
	public Car(String c)		
	{	
				System.out.println("Inside Overloaded Car Constructor.");		
				color = c;
	}
	
	public void start()
	{
	
				System.out.println("Car started."); 
		
	}
	
	public void setColor(String c)
	{
		
				color = c;
	}
	
	public String getColor()
	{
		
				return color;  
	}
	
}   