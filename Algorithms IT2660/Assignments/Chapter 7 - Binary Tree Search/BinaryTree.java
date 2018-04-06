public class BinaryTree
{
	Node root; 
	
	public void addNode(int key, String name)
	{
		Node nodeToAdd = new Node(key, name); 	
		
		//If tree is empty, create root node:  
		if(root == null)
		{
			root = nodeToAdd;
         System.out.println(nodeToAdd.name + " has been added to the Family Tree."); 
			return; 
		}
		
		//If tree is not empty
		else
		{
          //Recursively traverse the tree to properly add the node
		    traverseNode(root, nodeToAdd);		
		
		}
	}
   
   private void traverseNode(Node nodeInFocus, Node nodeToAdd)
   {
      //The node to be added is less than the parent node currently in focus
      if(nodeToAdd.key < nodeInFocus.key)
      {  
         //Empty space found, fill it w/ the new node
         if(nodeInFocus.leftChild == null)
         {
            nodeInFocus.leftChild = nodeToAdd;
            System.out.println(nodeToAdd.name + 
                               " has been added to the Family Tree as " + nodeInFocus.name + 
                               "'s Left Child"); 
         }
         //No Empty space yet, traverse again
         else
         {
            traverseNode(nodeInFocus.leftChild, nodeToAdd);
         }
      }
      
      //The node to be added is more than the parent node currently in focus
      else if (nodeToAdd.key > nodeInFocus.key)
      {
         //Empty space found, fill it w/ the new node
         if(nodeInFocus.rightChild == null)
         {
            nodeInFocus.rightChild = nodeToAdd;
            System.out.println(nodeToAdd.name + 
                               " has been added to the Family Tree as " + nodeInFocus.name + 
                               "'s Right Child"); 
 
         }
         //No Empty space yet, traverse again
         else
         {
            traverseNode(nodeInFocus.rightChild, nodeToAdd); 
         }
       }
   }

	public static void main(String [] args)
	{
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(58, "James");
		tree.addNode(56, "Sandra");
		tree.addNode(26, "Nate");
		tree.addNode(21, "Marie"); 
      
      
	}

}






