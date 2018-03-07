import java.util.Scanner;                                             /*Allows the use of the Scanner class*/
public class IntegerDemoInteractive
{

	public static void main(String[] args)
	{
	 int anInt;
	 byte aByte;
	 short aShort;
	 long aLong;
	
	 Scanner input = new Scanner(System.in);  	                      /*Scanner object declaration; Connects it to the 'System.in' property*/
	 
	 System.out.print("Please enter an integer: ");                   /*Prompts user for integer value*/
	 anInt = input.nextInt();                                         /*Input statement that accepts the integer value*/
	 System.out.print("Please enter a byte integer: ");
	 aByte = input.nextByte();
	 System.out.print("Please enter a short integer: ");
	 aShort = input.nextShort();
	 System.out.print("Please enter a long integer: ");
	 aLong = input.nextLong();
	}
	
}
