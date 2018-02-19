public class LinkedList
{
	private Node Root;	//List Header
	private Node Last;
	private int Size;		//Size of List 
	
	public LinkedList(Node node)		//Constructor - takes 1 Node parameter and initializes all 3 variables 
	{
		Root = node; 
		Last = node; 
		Size = 1; 
	}
	
	public void Append(Node node) 
	{
		Last.SetNextNode(node);
		Last = node;
		Size++;		
	}
	
	public void InsertNodeAtPosition(Node node, int postition) 
	{
		Node temp = new Node(); 												
		temp = Root; 
		
		int pos = postition; 
		for(int i = 0; i < pos - 1; i++)
		{
			temp = temp.GetNextNode(); 
		}
		
		node.SetNextNode(Last.GetNextNode()); 
		
		Last.SetNextNode(node); 
		Last = node; 
		Size++; 
	}
	
	public void Print(Node node)
	{
		Node temp = new Node("temp");  											 
		temp = Root;
		
		
		System.out.println("First Node: " + Root); 
		System.out.println("Last Node: " + Last); 
		System.out.println("Node Size: " + Size); 
	}


}