public class Node
{
	private String Value;      
	private Node NextNode;     
	
	public Node(String val)    //Constructor 
	{
		Value = val;
	}
   
   public String getValue()
   {
      return Value; 
   }
		
	public Node getNextNode()   //Returns the current NextNode
	{
      return NextNode; 
	}
	
	public void setNextNode(Node node)  //Sets the NextNode property of the Node that calls it 
	{
		NextNode = node;  
	}
}