public class Merge 
{

    public  int[] merge_sort(int[] array)
    {
        if(array.length<=1)
        {
            return array;
        }
        
        int midPoint=array.length/2;
        
        int[] left = new int[midPoint];
        int[] right = new int[array.length-midPoint];
        int result[]=new int[array.length];
        
        for(int i=0;i<midPoint;i++)
        {
            left[i]=array[i];
        }
        
        int x=0;
        for(int j=midPoint;j<array.length;j++)
        {
            if(x<right.length)
            {
                right[x]=array[j];
                x++;
            }
        }
        
        left=merge_sort(left);
        right=merge_sort(right);
        
        result=merge(left,right);
        
        return result;
        
    }
    
     int[]  merge(int[] left,int[] right){
     int lengthResult = left.length+right.length;
     int indexL=0;
     int indexR=0;
     int resultIndex=0;
     int[] result = new int[lengthResult];
     
     while(indexL<left.length||indexR<right.length){
      if(indexL<left.length&&indexR<right.length){
       if(left[indexL]<=right[indexR]){
        result[resultIndex]=left[indexL];
        indexL++;
        resultIndex++;
       }else{
        result[resultIndex]=right[indexR];
        indexR++;
        resultIndex++;
       }
      }else if(indexL<left.length){
        result[resultIndex]=left[indexL];
        indexL++;
        resultIndex++;
      }else if(indexR<right.length){
        result[resultIndex]=right[indexR];
        indexR++;
        resultIndex++;
      }
     }
     return result;
    }
    