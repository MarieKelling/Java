public class ArrayPrimitives
{

	public static void main(String[] args)
	{
		int[] numbers;					//Allocates a reference variable initialized to null
		numbers = new int[3]; 		//Allocates 3 memory cell - each can store an int value, 
													//also stores the address of the first integer memory cell into the reference variable 'numbers'
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	
	}

}