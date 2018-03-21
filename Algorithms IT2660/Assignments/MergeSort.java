public class MergeSort
{
	public static void main (String[] args)
	{  
		int[] list = {1, 4, 8, 12, 15, 9, 10, 4, 18, 3, 11, 22, 17, 6, 13, 14}; //16 integer array 
	      
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
                 
         for(int i = 0; i < mid; i++)
      	{
            left[i] = list[i];
     		}
         
         int x = 0;
         for(int j = mid; j < list.length; j++)
      	{
            right[x] = list[j]; 
     		}
         
         //Recursive Calls: 
         left = merge_sort(left);
         right = merge_sort(right);
         
         //Call Subroutine: 
         return merge(left, right);    
       }
    }
    
    public static int[] merge(int[] left, int[] right)
    {
      int resultLength = left.length + right.length; 
      int[] result = new int[resultLength]; 
    
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
