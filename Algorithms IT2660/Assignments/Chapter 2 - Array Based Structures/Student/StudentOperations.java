import java.util.Scanner; 
public class StudentOperations
{
			private int next; 
			private int size; 
			private Student[] data; 
			Scanner s = new Scanner(System.in); 
			
			public StudentOperations()											//No-Parameter Constructor to initialize an UnsortedOptimizedArray object
			{ 	
				System.out.println("Enter the maximum size of the data set: ");
				size = s.nextInt(); 
				next = 0; 
				data = new Student[size];						//permits the client to specify a max amount for the data set 
			}
			
			
		///////////////////////////////////////////////////////////////////INSERT METHOD///////////////////////////////////////////////////////////////////
			public boolean insert(Student newNode)
			{
				if(next >= size)				//structure is full
					return false; 
					
				data[next] = newNode.deepCopy();			//store a deep copy of the client's node in the index of next 
				
				if(data[next] == null) 	//insufficient system memory 
					return false;
					
				next = next + 1 ; 			//prepare for next insert 
					return true; 
			}
			
		///////////////////////////////////////////////////////////////////FETCH METHOD///////////////////////////////////////////////////////////////////
			public Student fetch(String targetKey)
			{
				Student node; 
				Student temp; 
				
				//**access the node using a sequential search**
				int i = 0; 
				while(i < next && !(data[i].compareTo(targetKey) == 0 ))
				{
					i++ ; 
				}
				if (i == next)			//node not found 
					return null ; 
				
				//deep copy the node's info into the client's node 
				node = data[i].deepCopy();
				
				//move the node up one position in the array, unless it is the first node
				if(i != 0)		//bubble-up accessed node 
					{
						temp = data[i - 1];
						data[i - 1] = data[i];
						data[i] = temp; 
					}
					return node;			
			}
			
///////////////////////////////////////////////////////////////////DELETE METHOD///////////////////////////////////////////////////////////////////
			public boolean delete(String targetKey)
			{
				//**access the node using a sequential search**
				int i = 0 ; 
				while(i < next && !(data[i].compareTo(targetKey) == 0 ))
				{   
					i++; 
				}
				if (i == next)			//node not found 	
					return false;		
			
			//move the last node into the deleted node's position 
			data[i] = data[next - 1];
			data[next - 1] = null;
			next = next - 1;
			return true;			//the node was found & deleted 
			}
			
///////////////////////////////////////////////////////////////////UPDATE METHOD///////////////////////////////////////////////////////////////////
			public boolean update(String targetKey, Student newNode)
			{
				if(delete(targetKey) == false)
					return false;
				else if(insert(newNode) == false)
					return false; 
				else
					return true; 			//node was found & updated 
			}
			
}