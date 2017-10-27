import java.util.Scanner;
public class MyStringClass
{
	
	public String reverseString (String myStr){

		StringBuilder str = new StringBuilder(myStr);
		StringBuilder strReverse;
		
		// reverse characters of the StringBuilder and print it
		
		strReverse = str.reverse();

		return strReverse.toString();

	}

	public String getString() {
		// Get console String input
		System.out.print("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		return (str);
	}
 
} 