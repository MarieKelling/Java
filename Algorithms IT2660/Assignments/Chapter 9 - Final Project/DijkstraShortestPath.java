import java.util.*;
import java.io.*;
import java.lang.*;
 
class DijkstraShortestPath
{
    //Finds vertex with min distance value, from the set of vertices not included in spTree 
    static int V=9;
    int minDistance(int distance[], Boolean spTreeSet[])
    {
        //min value initialized
        int min = Integer.MAX_VALUE, minIndex = -1;
 
        for (int v = 0; v < V; v++)
            if (spTreeSet[v] == false && distance[v] <= min)
            {
                min = distance[v];
                minIndex = v; 
            }
        return minIndex;
    }
     
    //Calculate shortest path from the given source  
    void dijkstraSearch(int graph[][], int source)
    {
        int distance[] = new int[V]; 
         
        Boolean spTreeSet[] = new Boolean[V];
 
        for (int i = 0; i < V; i++)
        {
            distance[i] = Integer.MAX_VALUE;
            spTreeSet[i] = false;         //true if vertex is included in spTree
        }
 
        distance[source] = 0;
 
        // Find sp 
        for (int count = 0; count < V-1; count++)
        { 
            int u = minDistance(distance, spTreeSet);
 
            spTreeSet[u] = true;          //chosen vertex marked
 
            for (int v = 0; v < V; v++)
 
            if (!spTreeSet[v] && graph[u][v]!=0 && distance[u] != Integer.MAX_VALUE &&
                distance[u] + graph[u][v] < distance[v])distance[v] = distance[u] + graph[u][v];
        }
         printDistanceArray(distance, V); 
    }
    
    public void printDistanceArray(int dist[], int n)
    {
        System.out.println("Vertex - Distance from given Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " - - - - > " + dist[i]);
    }

    public static void main (String[] args)
    {
       int graph[][] = new int[][]{{0, 4, 14, 0, 0, 1, 5, 8, 0}, {4, 0, 8, 8, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2}, {0, 0, 7, 0, 9, 14, 16, 0, 0},
                                  {7, 5, 3, 9, 0, 10, 0, 4, 0}, {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {1, 0, 5, 0, 0, 2, 0, 1, 9}, {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 1, 0, 0, 9, 4, 7, 0}, {0, 0, 1, 0, 0, 9, 4, 7, 0} };
                                  
        DijkstraShortestPath sp = new DijkstraShortestPath();
        sp.dijkstraSearch(graph, 4);
    }
}