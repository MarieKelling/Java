public class BubbleSort
{
	 // logic to sort the elements
	public int[] bubble_srt(int array[]) 
    {
        for (int a = 0; a < array.length - 1; a++) 				//While a < 8, move to the next for loop
		{
            for (int i = 0; i < array.length - 1; i++) 			//While i < 8, move to the if statement 
			{
				int j = i + 1;
                if (array[i] > array[j]) 								//If # at position 0 > # at postion 1, swap the numbers 
				{
                    swapNumbers(i, j, array); 
                }
            }
		}	
       return(array);
    }

	 private static void swapNumbers(int i, int j, int[] array) 		//Original: i = 4, j = 2
	 { 
        int temp = array[i];								//temp is set to 4
        array[i] = array[j];									//i is set to 2
        array[j] = temp;									//j is set to 4 
	 }
}