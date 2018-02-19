public class GenericOutput<T>
{

	public <T> void outputNumericArray(T[] array)
	{
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]); 
	
	}

}