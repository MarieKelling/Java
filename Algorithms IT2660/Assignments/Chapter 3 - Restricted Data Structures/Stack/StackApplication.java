public class StackApplication
{
	public static void main(String[] args)
	{
		Stack stack = new Stack(3);
		
			Listing list1 = new Listing("Peter", "1st Street", "330-123-4567");
			Listing list2 = new Listing("Paul", "2nd Street", "214-123-4567");
			Listing list3 = new Listing("Mary", "3rd Street", "440-123-4567"); 
			Listing list4 = new Listing("Marie", "4th Street", "330-840-1923");
			Listing temp;  
		
		System.out.println("************************Underflow Error***************************");
		System.out.println(stack.pop());		//attempts to perform a push on a full stack --> underflow
		
		System.out.println("*************************3 Push Operations - Peter, Paul, & Mary*******************");
		System.out.println(stack.push(list1));
		System.out.println(stack.push(list2));
		System.out.println(stack.push(list3));
		
		System.out.println("***************************showAll Method**************************");
		stack.showAll(); 
		
		//System.out.println(stack.push(list4)); - attempts to perform a push on a full stack --> overflow 
                                                //Results in a ArrayIndexOutOfBoundsException
		
		System.out.println("****************3 Pop Operations displayed w/ toString method*****************");
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		
		System.out.println("*************showAll Method - should display nothing*************"); 
		stack.showAll(); 
		
	}
}