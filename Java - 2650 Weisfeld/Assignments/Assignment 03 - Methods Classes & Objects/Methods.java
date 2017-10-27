public class Methods  
{

	public static void main(String[] args)
	{
	
				System.out.println("Hello Methods!");
		
				Car mustang = new Car("Blue");
				
				System.out.println("The mustang color after the constructor is " + mustang.getColor());
		
				mustang.start(); 
		
				mustang.setColor("Red");
		
				System.out.println("The mustang color after the setter is " + mustang.getColor());
		
	}

} 