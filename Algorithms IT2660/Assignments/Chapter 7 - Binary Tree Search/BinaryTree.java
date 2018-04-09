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
         System.out.println(); 
		}
		
		//If tree is not empty, recursively traverse the tree 
		else
		{
			Node nodeOfFocus = root;
			Node parent; 
			
			while (true)
			{
				parent = nodeOfFocus;
				
				 //Key of the node to be added is LESS than the parent node currently in focus
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
				//Key of the node to be added is MORE than the parent node currently in focus
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
	
		public boolean deleteNode(int key)
		{
			Node nodeOfFocus = root;
			Node parent = root; 
			
			//Search to the left or the right?
			
			boolean isThisALeftChild = true;
			
			while (nodeOfFocus.key != key)
			{
				parent = nodeOfFocus;  
				
				//Search Left
				if (key < nodeOfFocus.key)
            {
               isThisALeftChild = true; 
				
				   nodeOfFocus = nodeOfFocus.leftChild;
            }
			else   {
				//Search Right
				isThisALeftChild = false; 
				
				nodeOfFocus = nodeOfFocus.rightChild; 
			}
			
			if (nodeOfFocus == null)
				return false;
        } 
		
		//When nodeToDelete has no children, simply delete it 
			if (nodeOfFocus.leftChild == null && nodeOfFocus.rightChild == null)
			{
				//When nodeToDelete is the root 
				if (nodeOfFocus == root)
					root = null;  
						
				//When nodeToDelete is a leftChild
				else if (isThisALeftChild)
					parent.leftChild = null;
				
				//When nodeToDelete is a rightChild
				else
					parent.rightChild = null; 		
			}
		
		//No rightChild 
			else if (nodeOfFocus.rightChild == null)
			{
				if (nodeOfFocus == root)
					root = nodeOfFocus.leftChild;

				//If nodeOfFocus is on left of parent, 
				   //move nodeOfFocus's LEFT child up to the parent 
				
				else if (isThisALeftChild) 
					parent.leftChild = nodeOfFocus.leftChild; 
				
				//Vice versa 
				else
					parent.rightChild = nodeOfFocus.leftChild; 
			}
		
		//No leftChild
			else if (nodeOfFocus.leftChild == null) 
			{
				if (nodeOfFocus == root)   {
					root = nodeOfFocus.rightChild;
				}			
				
				//If nodeOfFocus is on left of parent, 
				   //move nodeOfFocus's RIGHT child up to the parent 
				
				else if (isThisALeftChild)   {
					parent.leftChild = nodeOfFocus.rightChild; 
				}
				
				//Vice versa
				else   {
					parent.rightChild = nodeOfFocus.rightChild; 
				}
			}
		
		//When nodeToDelete has both L & R children 
   		else
   			{
   				Node replacementNode = getReplacementNode(nodeOfFocus);
   				
   				if (nodeOfFocus == root)   {
   					root = replacementNode;
   				}
   				
   				//If deleted node was a L. child  - replace w replacementNode
   				else if (isThisALeftChild)   {
   					parent.leftChild = replacementNode; 
   				}
   				
   				//Vice versa 
   				else   {
   					parent.rightChild = replacementNode;
   				}
   				
   				replacementNode.leftChild = nodeOfFocus.leftChild; 
   			}
   			return true; 
   		}

		public Node getReplacementNode(Node replacementNode)
		{
			Node replacementParent = replacementNode; 
			Node replacement = replacementNode; 
			
			Node nodeOfFocus = replacementNode.rightChild;
			
			//When there's no left children
			while (nodeOfFocus != null)
			{
				replacementParent = replacement;
				replacement = nodeOfFocus; 
				nodeOfFocus = nodeOfFocus.leftChild; 
			}
			
			//If replacementNode is NOT the right child
			if (replacement != replacementNode.rightChild)
			{
				replacementParent.leftChild = replacement.rightChild; 
				replacement.rightChild = replacementNode.rightChild; 
			}
			return replacement; 	
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
		  familyTree.addNode(58, "James");  
		  
        System.out.println("Inorder Traversal display of the Family Tree: "); 
		  familyTree.inOrderTraversal(familyTree.root); 
        System.out.println();
        
        System.out.println("Find the Node with the key 58: "); 
        System.out.println(familyTree.findNode(58)); 
        System.out.println();
        
        System.out.println("Delete the Node with the key 58: "); 
        System.out.println(familyTree.deleteNode(58));   
        System.out.println();
        
        System.out.println("Inorder Traversal display of the Family Tree after deletion: ");  
        familyTree.inOrderTraversal(familyTree.root);  
	}

}






