public class MainLinkedList
{
	public static void main(String[] args)
	{
		Node n1 = new Node("A"); 
		Node n2 = new Node("B"); 
		Node n3 = new Node("C"); 
		Node n4 = new Node("D"); 
		Node n5 = new Node("E"); 
		Node n6 = new Node("F"); 
		Node n7 = new Node("G"); 
		LinkedList list = new LinkedList(n4);  
		
		list.Append(n5);
		list.Append(n6);
		
		list.Append(n1);
		list.Append(n2);
		list.Append(n3);
		list.Append(n7); 
		
		list.InsertNodeAtPosition(n1, 1); 
		list.InsertNodeAtPosition(n2, 2); 
		list.InsertNodeAtPosition(n3, 3); 
		list.InsertNodeAtPosition(n4, 4); 
		list.InsertNodeAtPosition(n5, 5);  
		list.InsertNodeAtPosition(n6, 6); 
		list.InsertNodeAtPosition(n7, 7); 	
			
	}

}