public class Person
{
	private String name;
	private int age;
	private double weight;
	
	public Person(String n, int a, double w)			//Constructor Method initializes the data members
	{
		name = n;
		age = a;
		weight = w;
	
	}
	
	public String toString()									//Facilitates the output of the data members' values 
	{
		return("At the ripe age of " + age + ", " + 
					name + " has the weight of " + weight + " pounds."); 
		
	}

}