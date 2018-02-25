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
      Node walker = Root;           //this - put in Node class
      
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
         return append(newNode);
      }
      //General Case: 
      else  {
   		Node back = getNodeAtPosition(position - 1); //back represents the person being cut in line
         newNode.setNextNode(back.getNextNode()); //Points the arg-node at the node back was pointed to
         back.setNextNode(newNode);          //Points back to the new node --> newNode cuts back in line
         return newNode; //this - put in Node class
         }
	}
 
   //EDGE CASES******************************************************************
   
   //Edge Case 1: Inserting a Node in the last position
   public Node append(Node node)     
   {
      Last.setNextNode(node);  //Sets the current Last's NextNode property to the node being appended
      Last = node;             //Points current Last node reference to the node being appended 
      Size++;
      return node;             //Returns the node that... Last should point at? 
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
      return newRoot;
   }
   
   public void print() {
      Node walker = this.Root;
      for (int i=0; i<this.getListSize(); i++) {
         System.out.println(walker.getValue());
         walker = walker.getNextNode();
      }
   }
}