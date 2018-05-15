import java.util.*;
import java.io.*;
import java.lang.*;
 
class DijkstraShortestPath
{
    public static void main (String[] args)
    {
       int graph[][] = new int[][]{{0, 4, 14, 0, 0, 1, 5, 8, 0}, {4, 0, 8, 8, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2}, {0, 0, 7, 0, 9, 14, 16, 0, 0},
                                  {7, 5, 3, 9, 0, 10, 0, 4, 0}, {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {1, 0, 5, 0, 0, 2, 0, 1, 9}, {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 1, 0, 0, 9, 4, 7, 0}, {0, 0, 1, 0, 0, 9, 4, 7, 0} };
                                  
        DijkstraShortestPath path = new DijkstraShortestPath();
        path.dijkstraSearch(graph, 4);
    }
    
     public static int V = 8;

    //Find vertex with min distance value (of vertices not included in spTree) 
    int minDistance(int distance[], Boolean spTreeSet[])
    {
        int min = Integer.MAX_VALUE, minIndex = -1;         //min value 
 
        for (int v = 0; v < V; v++)
            if (spTreeSet[v] == false && distance[v] <= min)
            {
                min = distance[v];
                minIndex = v; 
            }
        return minIndex;
    }
     
    //Find shortest path from given source  
    void dijkstraSearch(int graph[][], int source)
    {
        int distance[] = new int[V]; 
         
        Boolean spTreeSet[] = new Boolean[V];
 
        for (int i = 0; i < V; i++)
        {
            distance[i] = Integer.MAX_VALUE;
            spTreeSet[i] = false;           //true if vertex is included in spTree
        }
 
        distance[source] = 0;
 
        //Find best path  
        for (int count = 0; count < V - 1; count++)
        { 
            int x = minDistance(distance, spTreeSet);
 
            spTreeSet[x] = true;          //chosen vertex marked
 
            for (int v = 0; v < V; v++)
 
            if (!spTreeSet[v] && graph[x][v] != 0 && distance[x] != Integer.MAX_VALUE &&
                distance[x] + graph[x][v] < distance[v])distance[v] = distance[x] + graph[x][v];
        }
         printDistanceArray(distance, V); 
    }
    
    public void printDistanceArray(int distance[], int n)
    {
        System.out.println("Vertex - Distance from given Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " - - - - > " + distance[i]);
    }
}