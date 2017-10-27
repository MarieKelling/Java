public class Assignment07  
{  
   public static void main(String args[]){ 
       
      System.out.println("Greetings: this program is written by Marie Kelling");  
   
      String reverseStr; 
 
      // create object instance 
      MyStringClass myStrObject = new MyStringClass(); 
       
      // get string from console 
      String str = myStrObject.getString(); 
      System.out.println("You entered this string: " + str); 
       
      // reverse string 
      reverseStr = myStrObject.reverseString(str); 
       
      // print out reversed string 
      System.out.println("The string reversed is: " + reverseStr); 
 
   }  
    
} 