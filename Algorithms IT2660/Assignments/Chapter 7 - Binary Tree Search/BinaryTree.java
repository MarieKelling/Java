public class BinaryTree
{
	Node root; 
	
	public void addNode(int key, String name)
	{
		Node nodeToAdd = new Node(key, name); 	
		
		//If tree is empty, create root node  
		if(root == null)
		{
			root = nodeToAdd;
			System.out.println(nodeToAdd.name + " has been added to the Family Tree as the Root."); 
		}
		
		//If tree is not empty, recursively traverse the tree 
		else
		{
			Node nodeOfFocus = root;
			Node parent; 
			
			while (true)
			{
				parent = nodeOfFocus;
				
				 //Key of the node to be added is less than the parent node currently in focus
				 if(nodeToAdd.key < nodeOfFocus.key)
				{  
					nodeOfFocus = nodeOfFocus.leftChild;
						
					 //Empty space found, place new node there 
					 if(nodeOfFocus == null)
					 {
						parent.leftChild = nodeToAdd; 
						return;
					 }
				}
				//Key of the node to be added is more than the parent node currently in focus
				else
				{
					nodeOfFocus = nodeOfFocus.rightChild;
						
					 //Empty space found, place new node there 
					 if(nodeOfFocus == null)
					 {     
						parent.rightChild = nodeToAdd;
						return;
					 }
				}		
			}
		}	
	}
         
         public void inOrderTraversal(Node nodeOfFocus)
         {
            if (nodeOfFocus != null)
			   {
				//Traverse left node
				inOrderTraversal(nodeOfFocus.leftChild);
				
				System.out.println(nodeOfFocus); 
				
				//Traverse right node
				inOrderTraversal(nodeOfFocus.rightChild); 
			   }
         }

		public Node findNode(int key)
		{
			Node nodeOfFocus = root;
			
			while (nodeOfFocus.key != key)
			{
				if (key < nodeOfFocus.key)   {
					
					nodeOfFocus = nodeOfFocus.leftChild; 
					
				} else   {
					
					nodeOfFocus = nodeOfFocus.rightChild; 
				}

				if (nodeOfFocus == null)
					return null;
			}
			return nodeOfFocus; 
		}

	public static void main(String [] args)
	{
		BinaryTree familyTree = new BinaryTree();
		
		  familyTree.addNode(56, "Sandra");
		  familyTree.addNode(26, "Nate");
		  familyTree.addNode(21, "Marie");
		  familyTree.addNode(88, "Grandma");
		  familyTree.addNode(90, "Grandpa"); 
		  familyTree.addNode(80, "Gerdie");  
		  
		  familyTree.inOrderTraversal(familyTree.root); 
        System.out.println();
        
        System.out.println("Find the Node with the key 88: "); 
        System.out.println(familyTree.findNode(88)); 
      
	}

}






