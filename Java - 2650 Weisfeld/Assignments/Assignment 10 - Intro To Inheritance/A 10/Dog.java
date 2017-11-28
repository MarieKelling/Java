public class Dog extends Mammal implements Nameable 			//The class that implements the interface provides the 
{																									//definition/implementation of the methods
	
	Head head;
	String name;
	
	public void makeNoise() 
    {
		System.out.println("Bark");
	}
	
	public void setName(String name)
	{         
          this.name = name;
     }    
	
     public String getName() 
	 {
        return this.name;
     }
}