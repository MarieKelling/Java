import java.util.Scanner; 
public class MyStringClass
{

	   public String reverseString (String myStr)
	   { 
    																											
			String strReverse="";
			for (int i= myStr.length()-1; i >= 0; i--) 
			{
				strReverse = strReverse + myStr.charAt(i);
			}
			
			return strReverse; 			
		}																							
    
   public String getString() 
   {       											
      System.out.print("Enter a String: ");  
      Scanner in = new Scanner(System.in);  
      String str = in.nextLine();        
	  
	  return (str); 
   } 

} 

