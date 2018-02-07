public class Stack
{
	private Listing[] data;		//An array of references to Listing objects
	private int top;
	private int size;
	
	public Stack()
	{
		top = -1;
		size = 100;
		data = new Listing[100];		//Sets default # of Listings in the newly created Stack
	}
	
	public Stack(int n)
	{
		top = -1;
		size = 100;
		data = new Listing[n];		//Allows user to set the # of Listings in the newly created Stack 
	}
	
	public boolean push(Listing newNode)
	{
		if(top == size - 1)
			return false;		//Overflow Error 
		else
		{
			top = top + 1;								//Prepares for the next push 
			data[top] = newNode.deepCopy();
			return true;
		}
	
	}
	
	public Listing pop()
	{
		int topLocation;
		
		if(top == -1)
			return null; 		//Underflow Error
		else
		{
			topLocation = top;
			top = top - 1;								//Prepares for the next pop 
			return data[topLocation]; 
		}
		
	}
	
	public void showAll()
	{
		for(int i = top; i >= 0; i--)
			System.out.println(data[i].toString()); 		//Outputs nodes from the top to the bottom of the stack 
	}
	
	
}