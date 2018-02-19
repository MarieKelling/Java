//import java.io.*;
//import java.util.List;
import java.util.ArrayList;

public class StackExpanded
{
	private Listing[] data;		//An array of references to Listing objects
	private int top;
	private int size;
	
	public StackExpanded()
	{
		top = -1;
		size = 100;
		data = new Listing[100];		//Sets default # of Listings in the newly created Stack
	}
	
	public StackExpanded(int s, int l)
	{
		top = -1;
		size = s; 
		data = new Listing[l];		//Allows user to set the # of Listings in the newly created Stack 
	}
	
	public void reset()
	{
		this.top = -1;  
	}
	
	public boolean emptyTest()
	{
		if(top == -1)
			return true;
		else 
			return false; 
	}	
		
	public boolean fullTest()
	{
		if(top == size - 1)
			return true;
		else 
			return false; 
	}
	
	public boolean push(Listing newNode) 
	{
		if(top == size - 1)
		{																//return false;		//Overflow Error 
			Listing[] tempArray = new Listing[data.length + 1]; 
			System.arraycopy(data, 0, tempArray, 0, data.length); 
			
			for(int i = 0; i < data.length; i++)  {
				tempArray[i] = data[i]; 
					}
				data = tempArray; 
				top = top + 1;								//Prepares for the next push 
				data[top] = newNode.deepCopy();
				return true; 
		}	
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
	
	public Listing peak()  
	{
		int topLocation;
		
		if(top == -1)
			return null; 		//Underflow Error
		else
			topLocation = top;
			return data[topLocation]; 
	}
	
	public void showAll()
	{
		for(int i = top; i >= 0; i--)
			System.out.println(data[i].toString()); 		//Outputs nodes from the top to the bottom of the stack 
	}
		
}