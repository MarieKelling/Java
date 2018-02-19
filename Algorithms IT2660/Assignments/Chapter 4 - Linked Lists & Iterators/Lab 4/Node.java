public class Node
{
	private String Value;
	private Node NextNode; 
	
	public Node(String val)
	{
		Value = val;
	}
	
	public Node()
	{
		
	}
	
	public String GetValue() 
	{
		return Value; 
	}
	
	public Node GetNextNode()
	{
      return NextNode; 
	}
	
	public void SetNextNode(Node node)
	{
		NextNode = node;  
	}
	
}