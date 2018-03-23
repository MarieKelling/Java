public class MergeSort
{
	public static void main (String[] args)
	{  
      //Delcare array
		int[] list = new int[10]; 
      
      //Populate array w random numbers
      for (int i = 0; i < list.length; i++)
      {
         list[i] = (int) Math.floor(Math.random() * 101); 
      }                      
	      
      System.out.println("Before Sorting The List: ");
      printList(list);
      
      merge_sort(list); 
      
      System.out.println("After Sorting The List: ");
      printList(list); 
	}
   
   ///////////////////////////////////////////////////////////////////////////////////////////////

   public static int[] merge_sort(int[] list)
   {
      //Base case:
      if(list.length <= 1)
      {
         return list; 
      }
      //Recursive Case:
      else
      {
         int mid = list.length/2;
         int[] left = new int[mid];
         int[] right = new int[list.length - mid];
         int[] result = new int[list.length];   
                 
         for(int i = 0; i < mid; i++)
      	{
            left[i] = list[i];
     		}
         
         int x = 0;
         for(int j = mid; j < list.length; j++)
      	{
            right[x] = list[j];
            x++;  
     		}
         
         //Recursive Calls: 
         left = merge_sort(left);
         right = merge_sort(right);
         
         //Call Subroutine: 
         result = merge(left, right); 
         
         return result;    
       }
    }
    
    public static int[] merge(int[] left, int[] right)
    {
      int resultLength = left.length + right.length; 
      int[] result = new int[resultLength]; 
      int leftIndex = 0;
      int rightIndex = 0;
      int resultIndex = 0; 
      
      while (leftIndex < left.length || rightIndex < right.length)
      {
         if (leftIndex < left.length && rightIndex < right.length)
         {
            if (left[leftIndex] <= right[rightIndex]) //left is smaller --> placed in the sorted list first
            {
               result[resultIndex] = left[leftIndex];
               leftIndex++;
               resultIndex++; 
            }
            else                                      //right is smaller --> placed in the sorted list first
            {
               result[resultIndex] = right[rightIndex];
               rightIndex++;
               resultIndex++; 
            }

         }
         //Only left or only right has elements in the list
         else if (leftIndex < left.length)
         {
            result[resultIndex] = left[leftIndex];
               leftIndex++;
               resultIndex++;
         }
         else if (rightIndex < right.length)
         {
            result[resultIndex] = right[rightIndex];
               rightIndex++;
               resultIndex++;
         }
      }
      return result; 
    }
    
    
    public static void printList(int[] list)
    {
      for(int i = 0; i < list.length; i++)
   	{
  			System.out.print(list[i] + " " );  
  		}
      System.out.println();
      System.out.println();
    }
 }
 
 
  /* public void mergeSort(int list[], int lowIndex, int highIndex)  
      {
			if (lowIndex == highIndex)  {
				return; 
			}
			else  {
				int middleIndex = (lowIndex + highIndex) / 2;
				mergeSort(list, lowIndex, middleIndex);				//perform mergeSort on bottom half of the list
				mergeSort(list, middleIndex + 1, highIndex); 		//perform mergeSort on top half of the list  
				merge(list, lowIndex, middleIndex + 1, highIndex)  //subroutine that merges the two halves back together  
			}
				
		} */
