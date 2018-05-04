import java.util.*;
import java.lang.*;
import java.io.*;

public class Grappphh
{
	HashMap<Integer, Node> nodeSearch = new HashMap<Integer, Node>();
	
	public static class Node
	{
			int id;
			LinkedList<Node> adjacent = new LinkedList<Node>();
			private Node(int id)
			{
				this.id = id; 
			}
	}
	
	private Node GetNode(int id) 
	{
		Node node = new Node(id);
		return node; 
	}
   
   
   public static void main(String[] args)
   {
      
   
   }
   
	
	public void AddEdge(int source, int destination)
	{
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d); //???
	}
	
	public boolean hasPathDFS(int source, in destination)
	{
			Node s = getNode(source);
			Node d = getNode(destination);
			HashSet<Integer> visited = new HashSet<Integer>();
			return hasPathDFS(s, d, visited); 	
	}
	
	private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited)
	{
		if (visited.contains(source.id)   {
			return false;
		}
		visited.add(source.id); 
		
		if (source == destination)   {
			return true;
		}
		
		for (Node child : source.adjacent)   {
			if (hasPathDFS(child, destination, visited)   {
				return true;
			}
		}
		return false; 	
	}
	
	public boolean hasPathBFS (int source, int destination)
	{
		return hasPathBFS(getNode(source), getNode(source), getNode(destination));
	}
	
	private boolean hasPathBFS (Node source, Node destination)
	{
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(source);
		
		while(!nextToVisit.isEmpty())   {
			Node node = nextToVisit.remove();
			if(node == destination)   {
				return true;
			}
			
			if(visited.contains(node.id))   {
				continue;
			}
			visited.add(node.id); 
			
			for (Node child : node.adjacent)   {
				nextToVisit.add(child);
			}
	}
	return false; 
}




















