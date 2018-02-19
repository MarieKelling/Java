public class ArrayPrimitives<T> 
{

	public static void main(String[] args)
	{
		int[] numbers ; 					//Allocates a reference variable initialized to null
		numbers = new int[3] ; 		//Allocates 3 memory cells - each can store an int value, 
													//also stores the address of the first integer memory cell into the reference variable 'numbers'
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		//for(int i = 0; i < numbers.length; i++)
		  //	System.out.println(numbers[i]) ;
	  
	  
	  
	  Integer[] integers = {10, 20, 30} ;
	  
	  Double[] doubles = {10.5, 20.8, 30.3} ; 
	  
	  
		outputNumericArray(T[] integers); 
		outputNumericArray(T[] doubles);  
		
		
	
	}

}


