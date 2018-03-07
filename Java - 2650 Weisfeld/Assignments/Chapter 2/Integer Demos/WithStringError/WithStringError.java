import java.util.Scanner;                                          
public class WithStringError
{

	public static void main(String[] args)
	{
	 String name;                                           /*Added String variable*/
	 int anInt;
	 byte aByte;
	 short aShort;
	 long aLong;
	
	 Scanner input = new Scanner(System.in);  	                     
	 
	 System.out.print("Please enter an integer: ");                   
	 anInt = input.nextInt();                                      
	 System.out.print("Please enter a byte integer: ");
	 aByte = input.nextByte();
	 System.out.print("Please enter a short integer: ");
	 aShort = input.nextShort();
	 System.out.print("Please enter a long integer: ");
	 aLong = input.nextLong();
	 
	 System.out.print("Please enter your name: ");          /*Prompts user for String value*/
	 name = input.nextLine();                               /*Statment that accepts the name value*/
	 System.out.println("Thank you, " + name);  
/*------------------------------------ERROR: THE OUPUT STATEMENT IS ONCORRECT BECAUSE THE INPUT STATEMENT THAT SHOULD RETRIEVE 
                                      THE NAME FROM THE KEYBOARD INSTEAD RETRIEVES THE 'ENTER KEY' THAT WAS STILL IN THE KEYBOARD 
								                              BUFFER AFTER THE LAST NUMERIC ENTRY-----------------------------------------------------*/	 
	}
	
}
