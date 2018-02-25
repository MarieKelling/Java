public class LinkedList
{
	private Node Root;	//This is a reference to the 1st Node in the list
	private Node Last;
	private int Size;		//Size of List 
	
   //Constructor 
	public LinkedList(Node node)		
   {
		Root = node; 
		Last = node; 
		Size = 1; 
	}
	
   public Node getNodeAtPosition(int position)
   {
      Node walker = Root;                       //this - put in Node class
      
      for(int i = 0; i < position; i++) {
         walker = walker.getNextNode();
      }

      return walker;
   }
   
	public Node insertNodeAtPosition(Node newNode, int position) 
	{
      //Edge Case 1: 
      if (position == 0)  {
         return newRoot(newNode);
      } 
      //Edge Case 2: 
      else if  (position == Size)  {
         return append(newNode);    //Returns the node that Root should point at/reference 
      }
      //General Case: 
      else  {
   		Node previous = getNodeAtPosition(position - 1); //previous represents the person being cut in line  --> newNode is cutting previous in line
         newNode.setNextNode(previous.getNextNode()); //Points the newNode at the node previous was originally pointing to
         previous.setNextNode(newNode);          //Points previous to the new node --> newNode has cut previous in line
         return newNode; //this - in Node class 
         }
	}
 
   //EDGE CASES******************************************************************
   
   //Edge Case 1: Inserting a Node in the last position
   public Node append(Node node)     
   {
      Last.setNextNode(node);  //Takes the node currently referenced by Last, & sets its NextNode property to the node being appended
      Last = node;             //Takes the reference node Last, & points it to the node being appended 
      Size++;
      return node;              
   }
         //Sub-Method
         public int getListSize()
         {
            int listSize = 1;
            Node walker = Root;
            while(walker.getNextNode() != null) {
               walker = walker.getNextNode();
               listSize++; 
            }
            return listSize;
         }
   
   //Edge Case 2: Inserting a Node into the 1st position
   public Node newRoot(Node newRoot)
   {
      newRoot.setNextNode(this.Root); 
      this.Root = newRoot;
      return newRoot;               //Returns the node that Root should point at/reference 
   }
   
   public void print() {
      Node walker = this.Root;               //Points walker to the current Root 
      for (int i=0; i<this.getListSize(); i++) {
         System.out.println(walker.getValue());
         walker = walker.getNextNode();
      }
   }
}